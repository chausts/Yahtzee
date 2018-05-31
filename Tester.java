public class Tester
{
    public static void main() {
        Scorecard scorecard = new Scorecard("Tester", false);
        Roll roll = new Roll();
        System.out.println(roll);
        scorecard.setScore(Scorecard.LARGE_STRAIGHT, 0);
        scorecard.setScore(Scorecard.SMALL_STRAIGHT, 0);
        System.out.println("=======================");
        int[] optimal = Examiner.getOptimalReRoll(scorecard, roll);
        for (int i : optimal) System.out.println(i);
        System.out.println("=======================");
        roll.reRoll(optimal);
        System.out.println(roll);
    }
}
