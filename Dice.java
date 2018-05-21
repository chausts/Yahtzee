public class Dice {   
    public int face;
    public String imageFace;
    private String toString;
    
    private static final String[] imageFaces = {
        new StringBuilder("+-------+").append(System.getProperty("line.separator")).append("|       |").append(System.getProperty("line.separator")).append("|   o   |").append(System.getProperty("line.separator")).append("|       |").append(System.getProperty("line.separator")).append("+-------+").toString(),
        new StringBuilder("+-------+").append(System.getProperty("line.separator")).append("| o     |").append(System.getProperty("line.separator")).append("|       |").append(System.getProperty("line.separator")).append("|     o |").append(System.getProperty("line.separator")).append("+-------+").toString(),
        new StringBuilder("+-------+").append(System.getProperty("line.separator")).append("| o     |").append(System.getProperty("line.separator")).append("|   o   |").append(System.getProperty("line.separator")).append("|     o |").append(System.getProperty("line.separator")).append("+-------+").toString(),
        new StringBuilder("+-------+").append(System.getProperty("line.separator")).append("| o   o |").append(System.getProperty("line.separator")).append("|       |").append(System.getProperty("line.separator")).append("| o   o |").append(System.getProperty("line.separator")).append("+-------+").toString(), 
        new StringBuilder("+-------+").append(System.getProperty("line.separator")).append("| o   o |").append(System.getProperty("line.separator")).append("|   o   |").append(System.getProperty("line.separator")).append("| o   o |").append(System.getProperty("line.separator")).append("+-------+").toString(),
        new StringBuilder("+-------+").append(System.getProperty("line.separator")).append("| o   o |").append(System.getProperty("line.separator")).append("| o   o |").append(System.getProperty("line.separator")).append("| o   o |").append(System.getProperty("line.separator")).append("+-------+").toString(),
    };
    
    private void Roll () {
        this.face = (int)(Math.random() * 6) + 1;
        this.imageFace = imageFaces[this.face - 1];
        toString = new StringBuilder("A dice with the face of ").append(this.face).append(System.getProperty("line.separator")).append(this.imageFace).toString();
    }
    
    public Dice () {
        Roll();
    }
    
    public void reRoll () {
        Roll();
    }
    
    public int getFace () {
        return this.face;
    }
    
    public String getImageFace () {
        return this.imageFace;
    }
    
    public boolean equals (Object other) {
        if (other instanceof Dice) {
            Dice dice = (Dice) other;
            return dice.face == this.face;
        } else {
            return false;
        }
    }
    
    public String toString () {
        return toString;
    }
}
