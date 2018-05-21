public class Roll {
    public Dice[] rolls = new Dice[5];
    private String toString;
    
    private void buildToString () {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rolls.length; i++) {
            sb.append(rolls[i]);
            sb.append(System.getProperty("line.separator"));        
        }
        toString = sb.toString();
    }
    
    public Roll () {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = new Dice();
        }
        buildToString();
    }
    
    public void reRoll (int[] indexes) {
        for (int index : indexes) {
            rolls[index].reRoll();
        }
        buildToString();
    }
    
    public Dice getDice (int index) {
        return rolls[index];
    }
    
    public String toString () {
        return toString;
    }
}
