public class Scorecard {
    public int[] scores = new int[12];
    public String playerName;
    
    public Scorecard (String playerName) {
        this.playerName = playerName;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = -1;
        }
    }
    
    public String getPlayerName() {
        return playerName;
    }
}
