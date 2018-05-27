// https://bgsu.instructure.com/courses/901773/pages/p3-playing-yahtzee?module_item_id=6366493
// http://gunpowder.cs.loyola.edu/~jglenn/research/optimal_yahtzee.pdf
import java.util.*;
import java.lang.*;
public class Examiner {
    public static ArrayList<int[]> states;
    
    public static void init() {
        states = new RollStates().states;
    }
    
    public static int[] getOptimalKeep(Scorecard scorecard, Roll roll) {
        int optimalCategory = getOptimalCategory(scorecard, roll);
        int optimalCategoryScore = getCategoryScore(optimalCategory, roll.rolls);
        int[] optimalReRolls = new int[5];
        int[] basicRoll = toIntegerArray(roll);
        if (states == null) { states = new RollStates().states; }
        int level = (getCategoryScore(8, roll.rolls) != 0) ? 5 : 3; // a strategy to get 63 in the upper section has to do wih getting at least 3 in each upper section
        ArrayList<int[]> matches = getMatches(basicRoll, states, level);
        for (int i = 0; i < matches.size(); i++) {
            int[] set = matches.get(i);
            Roll temp = new Roll();
            for (int k = 0; k < set.length; k++) {
                temp.rolls[k].face = set[k];
            }
            int category = getOptimalCategory(scorecard, temp);
            int categoryScore = getCategoryScore(category, temp.rolls);
            if (categoryScore >= optimalCategoryScore) {
                optimalCategory = category;
                optimalCategoryScore = categoryScore;
                optimalReRolls = set;
            }
        }
        ArrayList<Integer> keep = new ArrayList<Integer>();
        for (int k = 0; k < optimalReRolls.length; k++) {
            for (int i = 0; i < basicRoll.length; i++) {
                if (optimalReRolls[k] == basicRoll[i]) {
                    keep.add(basicRoll[i]);
                    break;
                }
            }
        }
        int[] merge = new int[keep.size()];
        for (int i = 0; i < keep.size(); i++) {
            merge[i] = keep.get(i);
        }
        
        return merge;
    }
    
    public static int[] merge(int[] arr1, int[] arr2){
        int[] m = new int[arr1.length + arr1.length];
        int index = arr1.length;
        
        for (int i = 0; i < arr1.length; i++) {
            m[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            m[i + index] = arr2[i];    
        }
        return m;
    }
    
    public static int[] removeDuplicates(int[] arr) {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int k = 0; k < arr.length; k++) {
                if (i != k && curr == arr[k]) {
                    if (arr[k] == 1) one = true;
                    if (arr[k] == 2) two = true;
                    if (arr[k] == 3) three = true;
                    if (arr[k] == 4) four = true;
                    if (arr[k] == 5) five = true;
                    if (arr[k] == 6) six = true;
                }
            }
        }
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if (one && curr == 1) continue;
            if (two && curr == 2) continue;
            if (three && curr == 3) continue;
            if (four && curr == 4) continue;
            if (five && curr == 5) continue;
            if (six && curr == 6) continue;
            n.add(curr);
        }
        int[] f = new int[n.size()];
        for (int i = 0; i < f.length; i++) {
            f[i] = n.get(i);
        }
        
        return f;
    }
    
    public static int[] toIntegerArray(Roll roll) {
        int[] n = new int[roll.rolls.length];
        for (int i = 0; i < roll.rolls.length; i++) {
            n[i] = roll.rolls[i].face;
        }
        return n;
    }
    
    public static ArrayList<int[]> getMatches(int[] search, ArrayList<int[]> full, int min) {
        ArrayList<int[]> matches = new ArrayList<int[]>();
        for (int i = 0; i < full.size(); i++) {
            int[] set = full.get(i);
            int count = 0;
            for (int k = 0; k < set.length; k++) {
                if (set[k] == search[k]) count++;
            }
            if (count >= min) matches.add(set);
        }
        return matches;
    }
    
    public static int getOptimalCategory (Scorecard scorecard, Roll roll) {
        Dice[] rolls = roll.rolls;
        int[] scores = scorecard.scores;
        int optimalCategoryIndex = 0;
        int optimalCategoryScore = 0;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != -1) {
                continue;
            }
            
            int categoryScore = getCategoryScore(i, rolls);
            boolean isUpper = i < Scorecard.SIXES;
            int upperScore = getUpperScore(scorecard);
            int newUpperScore = (isUpper) ? upperScore + categoryScore : upperScore;
            int score = categoryScore;
            if (upperScore < 63 && newUpperScore >= 63) score += 35;
            if (score >= optimalCategoryScore) {
                optimalCategoryIndex = i;
                optimalCategoryScore = score;
            }
        }
        
        return optimalCategoryIndex;
    }
    
    public static int getUpperScore(Scorecard scorecard) {
        int score = 0;
        for (int i = 0; i < 6; i++) {
            score += scorecard.scores[i];
        }
        return score;
    }
    
    public static int getCategoryScore(int category, Dice[] rolls) {
        int face = category+1;
        if (category >= Scorecard.ACES && category <= Scorecard.SIXES) {
            return getNumberOfDice(face, rolls) * face;
        }
        else if (category == Scorecard.ONE_PAIR) {
            int maxPair = 0;
            
            for (int i = 0; i < 6; i++) {
                if (getNumberOfDice(i+1, rolls) >= 2) {
                    maxPair = i;
                }
            }
            return (maxPair+1) * 2;
        }
        else if (category == Scorecard.TWO_PAIR) {
            int maxPair = 0;
            int numPairs = 0;
            
            for (int i = 0; i < 6; i++) {
              if (getNumberOfDice(i+1, rolls) >= 2) {
                  maxPair += (i+1) * 2;
                  numPairs++;
                }
            }
            return (numPairs == 2) ? maxPair : 0;
        }
        else if (category == Scorecard.THREE_OF_A_KIND) {
            return getNOfAKind(3, rolls);
        }
        else if(category == Scorecard.FOUR_OF_A_KIND) {
            return getNOfAKind(4, rolls);
        }
        else if(category == Scorecard.SMALL_STRAIGHT) {
            boolean one = false;
            boolean two = false;
            boolean three = false;
            boolean four = false;
            boolean five = false;
            boolean six = false;
            for (Dice dice : rolls) {
                if (dice.face == 1) one = true;
                if (dice.face == 2) two = true;
                if (dice.face == 3) three = true;
                if (dice.face == 4) four = true;
                if (dice.face == 5) five = true;
                if (dice.face == 6) six = true;
            }
            return ((one && two && three && four) || (two && three && four && five) || (three && four && five && six)) ? 30 : 0;
        }
        else if(category == Scorecard.LARGE_STRAIGHT) {
            boolean one = false;
            boolean two = false;
            boolean three = false;
            boolean four = false;
            boolean five = false;
            boolean six = false;
            for (Dice dice : rolls) {
                if (dice.face == 1) one = true;
                if (dice.face == 2) two = true;
                if (dice.face == 3) three = true;
                if (dice.face == 4) four = true;
                if (dice.face == 5) five = true;
                if (dice.face == 6) six = true;
            }
            return ((one && two && three && four && five) || (two && three && four && five && six)) ? 40 : 0;
        }
        else if(category == Scorecard.FULL_HOUSE) {
            int two = 0;
            int three = 0;
        
            for (int i = 1; i <= 6; i++) {
                if (getNumberOfDice(i, rolls) == 3) {
                    three = i;
                } else if (getNumberOfDice(i, rolls) == 2) {
                    two = i;
                }
            }
        
            if ((two > 0) && (three > 0)) {
                return 25;
            }
        
            return 0;
        }
        else if(category == Scorecard.CHANCE) {
            return getTotalOfDice(rolls);
        }
        else if(category == Scorecard.YAHTZEE) {
            return getNOfAKind(5, rolls);
        }
        return 0;
    }
    
    public static int getNumberOfDice(int face, Dice[] rolls) {
        int count = 0;
        
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i].face == face) count++;
        }
        return count;
    }
    
    public static int getTotalOfDice(Dice[] rolls) {
        int count = 0;
        
        for (int i = 0; i < rolls.length; i++) {
            count += rolls[i].face;
        }
        return count;
    }
    
    public static int getNOfAKind(int n, Dice[] rolls) {
        for (int i = 1; i <= 6; i++) {
            if (getNumberOfDice(i, rolls) >= n) return i * n;
        }
        return 0;
    }
    
    public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}
