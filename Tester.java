public class Tester
{
    public static void main() {
        Scorecard scorecard = new Scorecard("Tester", false);
        Roll roll = new Roll();
        System.out.println(roll);
        System.out.println("=======================");
        int[] optimal = Examiner.getOptimalReRoll(scorecard, roll);
        for (int i : optimal) System.out.println(i);
        System.out.println("=======================");
        roll.reRoll(optimal);
        System.out.println(roll);
        System.out.println("=======================");
    }
}
