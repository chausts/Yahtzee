public class Tester
{
    public static void main() {
        Scorecard scorecard = new Scorecard("Tester", false);
        Roll roll = new Roll();
        System.out.println(roll);
        roll.rolls[0].face = 5;
        roll.rolls[1].face = 6;
        roll.rolls[2].face = 6;
        roll.rolls[3].face = 5;
        roll.rolls[4].face = 5;
        System.out.println("=======================");
        int[] optimal = Examiner.getOptimalKeep(scorecard, roll);
        for (int i : optimal) System.out.println(i);
    }
}
