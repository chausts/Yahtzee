import java.util.*;
public class RollStates {
    public ArrayList<int[]> states;
    
    public RollStates() {
        states = new ArrayList<int[]>();
        for (int a = 1; a <= 6; a++) {
            for (int b = 1; b <= 6; b++) {
                for (int c = 1; c <= 6; c++) {
                    for (int d = 1; d <= 6; d++) {
                        for (int e = 1; e <= 6; e++) {
                            int[] state = {a, b, c, d, e};
                            states.add(state);
                        }
                    }
                }
            }
        }
    }
}