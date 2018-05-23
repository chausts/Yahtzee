import java.util.*;
public class Yahtzee
{
    public static void playerTurn(Scorecard player) {
        Roll roll = new Roll();
    }
    
    public static Roll computerExamineTurn(Scorecard computer, Roll roll) {
        int numRolls = 1;
        int maxRolls = 3;
        int finalMoveIndex = 0;
        int finalMoveScore = 0;
        
        while (numRolls < maxRolls) {
            int maxScore = 0;
            ArrayList<Integer> open = new ArrayList<Integer>();
            for (int i = 0; i < computer.scores.length; i++) {
                if (computer.scores[i] > 0) open.add(computer.scores[i]);
            }
            for (int i = 0; i < open.size(); i++) {
                int score = 0;
                int index = 0;
                int temp = 0;
                //UPPER
                for (int c = 1; c < 7; c++) {
                    for (int k = 0; k < roll.rolls.length; k++) {
                        if (roll.rolls[k].face == c) temp++;
                        if (temp > score) {
                            score = temp;
                            index = c-1;
                            System.out.println(score + index);
                        }
                    }
                }
            }
            break;
        }
        computer.setScore(finalMoveIndex, finalMoveScore);
        return roll;
    }
    
    public static void computerTurn(Scorecard computer) {
        computerExamineTurn(computer, new Roll());
    }
    
    public static void main(String[] humanPlayerNames, int numComputerPlayers) {
        // Setup Players
        int numHumanPlayers = humanPlayerNames.length;
        int currentComputer = 1;
        Scorecard[] players = new Scorecard[numHumanPlayers + numComputerPlayers];
        
        for (int i = 0; i < numHumanPlayers; i++) {
            players[i] = new Scorecard(humanPlayerNames[i], false);
        }
        
        for (int i = 0; i < numComputerPlayers; i++) {
            players[i + numHumanPlayers] = new Scorecard("Computer" + currentComputer, true);
            currentComputer++;
        }
        
        int maxRounds = 13 * players.length;
        int round = 0;
        
        while (round < maxRounds) {
            round++;
            Scorecard player = players[round % players.length];
            if (player.isComputer) {
                computerTurn(player);
            } else {
                playerTurn(player);
            }
        }
    }
}
