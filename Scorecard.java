public class Scorecard {
    public int[] scores = new int[12];
    public String playerName;
    
    public Scorecard (String playerName) {
        this.playerName = playerName;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = -1;
        }
    }
    
    public int getTotal() {
        int total = 0;
        for (int score : scores) { 
            total += score; 
        }
        return total;
    }
    
    public int getUpperTotal() {
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < 6) {
                total += scores[i];
            }
        }
        return total;
    }
    
    public int getLowerTotal() {
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < 6) {
                total += scores[i+6];
            }
        }
        return total;
    }
    
    public String getPlayerName() {
        return playerName;
    }
}
