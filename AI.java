public class AI {
    public AI(Scorecard player, Roll roll) {
        int[] tempScores = new int[13];
        for (int i = 0; i < player.scores.length; i++) {
            if (player.scores[i] == -1) {
                if (i < 6) {
                    for (int k = 0; k < roll.rolls.length; k++) {
                        if (roll.rolls[k].face == i) {
                            tempScores[i] += i;
                        }
                    }
                }
            }
            else
            {
                tempScores[i] = player.scores[i];
            }
            System.out.println("SECTION_" + i + " = " + tempScores[i]);
        }
    }
}
