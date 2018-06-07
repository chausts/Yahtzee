import java.util.*;
public class Yahtzee
{
    public static void playerTurn(Scorecard player) {
        Roll roll = new Roll();                                                
        Scanner scanner = new Scanner(System.in);             
        Roll playerRoll = new Roll();
        System.out.println(playerRoll.toString());
        for(int j = 2; j > 0; j--)
        {
            System.out.println("You have " + j + " rerolls. How many dice would you like to reroll?");            
            int numReRoll = scanner.nextInt();
            if(numReRoll == 0)
            {
                j = 0;
            }          
            else if(numReRoll <= 5)
            {
                System.out.println("To reroll, say the position of the die you would like to reroll");
                int[] reRolled = new int[numReRoll];
                for(int a = 0; a < numReRoll; a++)
                {
                    System.out.println("Which die would you like to reroll?");
                    int indexReRoll = scanner.nextInt() - 1;
                    if(indexReRoll > 4){System.out.println("Please choose a die number 1-5."); a--;}
                    else{playerRoll.reRoll(indexReRoll);}
                }
                System.out.println(playerRoll.toString());
            }
            else{System.out.println("You only have 5 dice, please choose a number between 1-5.");j++;}
        }
        System.out.println("Here are your options for your turn: ");
        if(player.scores[0] == -1){System.out.println("Ones = " + Examiner.getCategoryScore(0, playerRoll.rolls) + " points.");}
        if(player.scores[1] == -1){System.out.println("Twos = " + Examiner.getCategoryScore(1, playerRoll.rolls) + " points.");}
        if(player.scores[2] == -1){System.out.println("Threes = " + Examiner.getCategoryScore(2, playerRoll.rolls) + " points.");}
        if(player.scores[3] == -1){System.out.println("Fours = " + Examiner.getCategoryScore(3, playerRoll.rolls) + " points.");}  
        if(player.scores[4] == -1){System.out.println("Fives = " + Examiner.getCategoryScore(4, playerRoll.rolls) + " points.");}
        if(player.scores[5] == -1){System.out.println("Sixes = " + Examiner.getCategoryScore(5, playerRoll.rolls) + " points.");}
        if(player.scores[6] == -1){System.out.println("Three of a kind = " + Examiner.getCategoryScore(6, playerRoll.rolls) + " points.");}
        if(player.scores[7] == -1){System.out.println("Four of a kind = " + Examiner.getCategoryScore(7, playerRoll.rolls) + " points.");}
        if(player.scores[8] == -1){System.out.println("Full House = " + Examiner.getCategoryScore(8, playerRoll.rolls) + " points.");}
        if(player.scores[9] == -1){System.out.println("Small Straight = " + Examiner.getCategoryScore(9, playerRoll.rolls) + " points.");}
        if(player.scores[10] == -1){System.out.println("Large Straight = " + Examiner.getCategoryScore(10, playerRoll.rolls) + " points.");}
        if(Examiner.getCategoryScore(11, playerRoll.rolls) != 0){System.out.println("Yahtzee = " + Examiner.getCategoryScore(11, playerRoll.rolls) + " points.");}
        if(player.scores[12] == 0){System.out.println("Chance = " + Examiner.getCategoryScore(12, playerRoll.rolls) + " points.");}
        for(int b = 0; b < 1; b++){
            System.out.println("What would you like to do? Please type in the category with NO spaces.");
            String playerMove = scanner.next();
            playerMove.toLowerCase();
            if(player.scores[0] == -1 && playerMove.equals("ones")){player.addToScore(Scorecard.ACES, Examiner.getCategoryScore(0, playerRoll.rolls));}
            else if(player.scores[1] == -1 && playerMove.equals("twos")){player.addToScore(Scorecard.TWOS, Examiner.getCategoryScore(1, playerRoll.rolls));}
            else if(player.scores[2] == -1 && playerMove.equals("threes")){player.addToScore(Scorecard.THREES, Examiner.getCategoryScore(2, playerRoll.rolls));}
            else if(player.scores[3] == -1 && playerMove.equals("fours")){player.addToScore(Scorecard.FOURS, Examiner.getCategoryScore(3, playerRoll.rolls));}
            else if(player.scores[4] == -1 && playerMove.equals("fives")){player.addToScore(Scorecard.FIVES, Examiner.getCategoryScore(4, playerRoll.rolls));}
            else if(player.scores[5] == -1 && playerMove.equals("sixes")){player.addToScore(Scorecard.SIXES, Examiner.getCategoryScore(5, playerRoll.rolls));}
            else if(player.scores[6] == -1 && playerMove.equals("threeofakind")){player.addToScore(Scorecard.THREE_OF_A_KIND, Examiner.getCategoryScore(6, playerRoll.rolls));}
            else if(player.scores[7] == -1 && playerMove.equals("fourofakind")){player.addToScore(Scorecard.FOUR_OF_A_KIND, Examiner.getCategoryScore(7, playerRoll.rolls));}
            else if(player.scores[8] == -1 && playerMove.equals("fullhouse")){player.addToScore(Scorecard.FULL_HOUSE, Examiner.getCategoryScore(8, playerRoll.rolls));}
            else if(player.scores[9] == -1 && playerMove.equals("smallstraight")){player.addToScore(Scorecard.SMALL_STRAIGHT, Examiner.getCategoryScore(9, playerRoll.rolls));}
            else if(player.scores[10] == -1 && playerMove.equals("largestraight")){player.addToScore(Scorecard.LARGE_STRAIGHT, Examiner.getCategoryScore(10, playerRoll.rolls));}
            else if(player.scores[11] == -1 && playerMove.equals("yahtzee")){player.addToScore(Scorecard.YAHTZEE, Examiner.getCategoryScore(11, playerRoll.rolls)); player.numYahtzeeBonuses++;}
            else if(player.scores[12] == -1 && playerMove.equals("chance")){player.addToScore(Scorecard.CHANCE, Examiner.getCategoryScore(12, playerRoll.rolls));}
            else{System.out.println("Please type in the category you would like to fill in. Do not add any extra spaces before, after, or in the category itself. Example: 'smallstraight'."); b--;} 
    }
}



    

    
    public static Roll computerExamineTurn(Scorecard computer, Roll roll) {
        for (int i = 0; i < computer.scores.length; i++) {
            if (computer.scores[i] == -1) {
                
            }
        }
        
        return roll;
    }
    
    public static void computerTurn(Scorecard computer) {
        System.out.println();
        Roll roll = new Roll();
        Scanner scanner = new Scanner(System.in);
        System.out.println(roll);
        System.out.println("Press Enter to continue.");
        scanner.nextLine();
        int numRolls = 2;
        while (numRolls > 0) {
            int[] bestReRollers = Examiner.getOptimalReRoll(computer, roll);
            System.out.println(computer.playerName + " rerolls the following dice: \n");
            for (int k : bestReRollers) {
                int face = k+1;
                System.out.print(face + " ");
            }
            System.out.println("");
            roll.reRoll(bestReRollers);
            System.out.println();
            System.out.println(roll);
            System.out.println("Press Enter to continue.");
            scanner.nextLine();
            numRolls--;
        }
        int category  = Examiner.getOptimalCategory(computer, roll);
        computer.addToScore(category, Examiner.getCategoryScore(category, roll.rolls));
        String cat = "";
        if (category == 0) cat = "aces";
        if (category == 1) cat = "twos";
        if (category == 2) cat = "threes";
        if (category == 3) cat = "fours";
        if (category == 4) cat = "fives";
        if (category == 5) cat = "sixes";
        if (category == 6) cat = "three of a kind";
        if (category == 7) cat = "four of a kind";
        if (category == 8) cat = "full house";
        if (category == 9) cat = "small straight";
        if (category == 10) cat = "large straight";
        if (category == 11) cat = "yahtzee";
        if (category == 12) cat = "chance";
        System.out.println(computer.playerName + " has chosen the " + cat + " category for " + Examiner.getCategoryScore(category,roll.rolls) + " points.");
        System.out.println("Press Enter to continue.");
        scanner.nextLine();
    }
                                    //remove parameters
    public static void main() {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Welcome to Yahtzee. Press 'Enter' to start.");
        String startStr = scanner.nextLine();
        while(true)
        {
            if(!(startStr.equals("")))
            {
                System.out.println("Please press enter to start.");
                startStr = scanner.nextLine();
            }
            else
            {
                break;
            }
        }        
        // Setup Players
        int currentComputer = 1;
        System.out.println("How many human players are playing? Please enter an integer.");
        int numHumanPlayers = scanner.nextInt();
        System.out.println("How many computer players do you want? Please enter an integer.");
        int numComputerPlayers = scanner.nextInt();
        Scorecard[] players = new Scorecard[numHumanPlayers + numComputerPlayers];        
        for (int i = 0; i < numComputerPlayers; i++) {
            players[i + numHumanPlayers] = new Scorecard("Computer" + currentComputer, true);
            currentComputer++;
        }
        for(int n = 1; n <= numHumanPlayers; n++){
           System.out.println("What is the name of Player " + n);
           String playerName = scanner.next();
           players[n] = new Scorecard(playerName, false);
        }
               
        int maxRounds = 13 * players.length;
        int round = 0;
        Roll roll = new Roll();
        while (round < maxRounds) {
            round++;
            Scorecard player = players[round % players.length];
            if(player.getIsComputer()) {
                System.out.println(player.getPlayerName() + "'s turn.");
                computerTurn(player);                
            } else {
                System.out.println(player.getPlayerName() + "'s turn.");
                playerTurn(player);              
            }
        }
        int max = 0;
        int player = 0;
        String multipleWins = "";
        int temp = 0;
        for(int j = 0; j < numHumanPlayers + numComputerPlayers; j++){
            temp = Examiner.getUpperScore(players[j]);
            for(int k = 6; k < 15; k++){
                temp += Examiner.getCategoryScore(k, roll.rolls);
                if((k == 6 && j ==0) || (k == 6 && temp > max)){
                    player = j;
                    max = temp;
            }
            else if(max == temp){
                multipleWins = players[player] + " and " + multipleWins;
            }
        }
        if(multipleWins.equals("")){System.out.println("Player " + player + " is the winner with " + max + " points!");}
        System.out.println("Player " + player + " are tied for the winner with " + max + " points!");        
    }
}
}