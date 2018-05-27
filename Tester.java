public class Tester
{
    public static void main() {
        Scorecard scorecard = new Scorecard("Tester", false);
        Roll roll = new Roll();
        System.out.println(roll);
        int[] optimal = Examiner.getOptimalKeep(scorecard, roll);
        for (int i = 0; i < optimal.length; i++) {
            System.out.print(optimal[i] + " ");
        }
    }
}
