public class Scorecard {
    public int[] scores = new int[13];
    public boolean isComputer;
    public String playerName;
    public int numYahtzeeBonuses = 0;
    
    public static final int ACES = 0;
    public static final int TWOS = 1;
    public static final int THREES = 2;
    public static final int FOURS = 3;
    public static final int FIVES = 4;
    public static final int SIXES = 5;
    
    public static final int THREE_OF_A_KIND = 6;
    public static final int FOUR_OF_A_KIND = 7;
    public static final int FULL_HOUSE = 8;
    public static final int SMALL_STRAIGHT = 9;
    public static final int LARGE_STRAIGHT = 10;
    public static final int YAHTZEE = 11;
    public static final int CHANCE = 12;
    
    public Scorecard (String playerName, boolean isComputer) {
        this.playerName = playerName;
        this.isComputer = isComputer;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = -1;
        }
    }
    
    public void setScore(int index, int x) {
        scores[index] = x;
    }
    
    public int getScore(int index) {
        return scores[index];
    }
    
    public void setName(String playerName) {
        this.playerName = playerName;
    }
    
    public String getName() {
        return playerName;
    }
    
    public void setIsComputer(boolean isComputer) {
        this.isComputer = isComputer;
    }
    
    public boolean getIsComputer() {
        return isComputer;
    }
    
    public void addToScore(int index, int amount) {
        scores[index] += amount;
    }
    
    public String getPlayerName() {
        return playerName;
    }
}
