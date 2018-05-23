public class Yahtzee
{
    public static void playerTurn(Scorecard player) {
        Roll roll = new Roll();
    }
    
    public static void computerExamineTurn(Roll roll) {
    }
    
    public static void computerTurn(Scorecard computer) {
        
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
