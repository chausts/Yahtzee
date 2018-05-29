import java.util.*;

/**
 *  This Class is used to examine and result best results from a computational
 *  standpoint. Made with these as a base:
 *      http://gunpowder.cs.loyola.edu/~jglenn/research/optimal_yahtzee.pdf
 *      https://bgsu.instructure.com/courses/901773/pages/p3-playing-yahtzee?module_item_id=6366493
 *      
 * Not the most optimal or efficient, however does it's purpose.
 *  
 *  @author Anthony Finn
 *  @date   5 - 26 - 18
 */

public class Examiner {
    // Public
    
    // All 7776 states of possible dice combinations.
    // Each roll has a ( 1 / 6^5 ) of being chosen, or about 00.01% chance.
    public static ArrayList<int[]> states;
    
    /**
     * Returns an Integer array of dice that should be kept on the roll.
     * The returned array will include dice that should be rerolled, the
     * first instance of that face, skipping already used faces.
     * 
     * Often goes for the straights first, as they are even more unlikely than a yahtzee.
     * If already most optimal, then it should return that too.
     * 
     * @param scorecard A Scorecard object which represents a player/computer.
     * @param roll      The specificed roll which should be analyzed.
     * @return          Optimal dices to keep.
     */
    public static int[] getOptimalKeep(Scorecard scorecard, Roll roll) {
        // Set standards for the current optimal.
        int optimalCategory = getOptimalCategory(scorecard, roll);
        int optimalCategoryScore = getCategoryScore(optimalCategory, roll.rolls);
        int[] optimalReRolls = new int[5];
        
        // Roll to an integer array for ease of access.
        int[] basicRoll = toIntegerArray(roll);
        
        // Create new states if not already.
        if (states == null) { states = new RollStates().states; }
        
        // Level of comparison based on original
        int level = (getCategoryScore(8, roll.rolls) != 0) ? 5 : 3;
        
        // Finds most optimal category based on similar states and level.
        ArrayList<int[]> matches = getMatches(basicRoll, states, level);
        // Iterate through each possible match.
        for (int i = 0; i < matches.size(); i++) {
            // Get the match result.
            int[] set = matches.get(i);
            // Create a new roll based on the match result.
            Roll temp = new Roll();
            for (int k = 0; k < set.length; k++) {
                temp.rolls[k].face = set[k];
            }
            // Get category based on the current set.
            int category = getOptimalCategory(scorecard, temp);
            int categoryScore = getCategoryScore(category, temp.rolls);
            // Compare the optimal to the current.
            if (categoryScore >= optimalCategoryScore) {
                // Set optimals if score is greater than previous
                optimalCategory = category;
                optimalCategoryScore = categoryScore;
                optimalReRolls = set;
            }
        }
        // Generate list of optimal dice to be kept.
        ArrayList<Integer> keep = new ArrayList<Integer>();
        for (int k = 0; k < optimalReRolls.length; k++) {
            for (int i = 0; i < basicRoll.length; i++) {
                if (optimalReRolls[k] == basicRoll[i]) {
                    keep.add(basicRoll[i]);
                    break;
                }
            }
        }
        
        // Convert back to an integer array.
        int[] merge = new int[keep.size()];
        for (int i = 0; i < keep.size(); i++) {
            merge[i] = keep.get(i);
        }
        
        return merge;
    }
    
    /**
     * Returns the index of the most optimal category, the category that
     * would give the player the best score for a roll.
     * 
     * @param scorecard A Scorecard object which represents a player/computer.
     * @param roll      The specificed roll which should be analyzed.
     * @return          Optimal category which has the most points.
     */
    public static int getOptimalCategory (Scorecard scorecard, Roll roll) {
        // Variables for ease of use.
        Dice[] rolls = roll.rolls;
        int[] scores = scorecard.scores;
        
        // Current optimals
        int optimalCategoryIndex = 0;
        int optimalCategoryScore = 0;
        
        // Iterate through each of the scores
        for (int i = 0; i < scores.length; i++) {
            // Check if score has been set then continue
            if (scores[i] != -1) {
                continue;
            }
            
            // Ease of use
            int categoryScore = getCategoryScore(i, rolls);
            boolean isUpper = i < Scorecard.SIXES;
            int upperScore = getUpperScore(scorecard);
            int newUpperScore = (isUpper) ? upperScore + categoryScore : upperScore;
            int score = categoryScore;
            // Account for possible points gained through the bonus, in which you should add 35 points.
            if (upperScore < 63 && newUpperScore >= 63) score += 35;
            // Compare score to the current optimal
            if (score >= optimalCategoryScore) {
                // If true, then set optimal.
                optimalCategoryIndex = i;
                optimalCategoryScore = score;
            }
        }
        
        // Return the most optimal index.
        return optimalCategoryIndex;
    }
    
    /**
     * Returns the total score of the upper section to a yahtzee scorecard.
     * 
     * @param scorecard A Scorecard object which represents a player/computer.
     * @return          Total score of the upper section.
     */
    public static int getUpperScore(Scorecard scorecard) {
        // Record current score.
        int score = 0;
        for (int i = 0; i < 6; i++) {
            // Iterate through the 1-6 categories and add score.
            score += scorecard.scores[i];
        }
        // Return total.
        return score;
    }
    
    /**
     * Returns the category score of a certain category. The category could
     * be found through the scorecard class, EX. Scorecard.ACES.
     * 
     * @param category  Given category to search.
     * @param rolls     Array of Dice to be used to determine score.
     * @return          Total score of given category.
     */
    public static int getCategoryScore(int category, Dice[] rolls) {
        // Record the face.
        int face = category+1;
        if (category >= Scorecard.ACES && category <= Scorecard.SIXES) {
            // If Category is 1-6, then find the score for that category.
            return getNumberOfDice(face, rolls) * face;
        }
        else if (category == Scorecard.ONE_PAIR) {
            // Used to create optimal results, @see credits
            int maxPair = 0;
            
            for (int i = 0; i < 6; i++) {
                if (getNumberOfDice(i+1, rolls) >= 2) {
                    maxPair = i;
                }
            }
            return (maxPair+1) * 2;
        }
        else if (category == Scorecard.TWO_PAIR) {
            // Likewise, Used to create optiaml results, @see credits
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
            // Returns if 3 faces recurr.
            return getNOfAKind(3, rolls);
        }
        else if(category == Scorecard.FOUR_OF_A_KIND) {
            // Returns if 4 faces recurr.
            return getNOfAKind(4, rolls);
        }
        else if(category == Scorecard.SMALL_STRAIGHT) {
            // Returns if a straight occurs, 1234, 2345, 3456
            boolean one = false;
            boolean two = false;
            boolean three = false;
            boolean four = false;
            boolean five = false;
            boolean six = false;
            // Couldn't find a simple way to do this, so create if a face have been found and comparing later would be the most simple.
            for (Dice dice : rolls) {
                if (dice.face == 1) one = true;
                if (dice.face == 2) two = true;
                if (dice.face == 3) three = true;
                if (dice.face == 4) four = true;
                if (dice.face == 5) five = true;
                if (dice.face == 6) six = true;
            }
            // List of all possible outcomes for a small straight.
            return ((one && two && three && four) || (two && three && four && five) || (three && four && five && six)) ? 30 : 0;
        }
        else if(category == Scorecard.LARGE_STRAIGHT) {
            // Like a small straight, just has different outcomes, only 2. 12345, 23456
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
            // index of two and three
            int two = 0;
            int three = 0;
            
            // find two and three
            for (int i = 1; i <= 6; i++) {
                if (getNumberOfDice(i, rolls) == 3) {
                    three = i;
                } else if (getNumberOfDice(i, rolls) == 2) {
                    two = i;
                }
            }
            
            // if both are found then give score of 25.
            if ((two > 0) && (three > 0)) {
                return 25;
            }
        
            return 0;
        }
        else if(category == Scorecard.CHANCE) {
            // Chance is just the total.
            return getTotalOfDice(rolls);
        }
        else if(category == Scorecard.YAHTZEE) {
            // Yahtzee if 5 of a kind.
            return getNOfAKind(5, rolls);
        }
        return 0;
    }
    
    //Private
    // Not documented because they are private.
    
    /**
     * Returns an Integer array which converted a specified roll into
     * a Integer array.
     * 
     * @param roll  Roll to be be converted to an Integer array
     * @return      Integer array of roll
     */
    private static int[] toIntegerArray(Roll roll) {
        int[] n = new int[roll.rolls.length];
        for (int i = 0; i < roll.rolls.length; i++) {
            n[i] = roll.rolls[i].face;
        }
        return n;
    }
    
    /**
     * Returns the number of dice with a certain face.
     * 
     * @param face  The face to be used as a search query.
     * @param rolls The roll to be searched through.
     * @return      The number of dice with a certain face.
     */
    private static int getNumberOfDice(int face, Dice[] rolls) {
        int count = 0;
        
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i].face == face) count++;
        }
        return count;
    }
    
    /**
     * Returns an ArrayList of Integer arrays which contain the most
     * similar array to a given ArrayList of Integer arrays by min amount.
     * 
     * @param search    The search query, or array to be the model.
     * @param full      The results, or full list of arrays to be searched.
     * @param min       The minimum amount of matches in the array to be 
     *                  considered similar.
     * @return          ArrayList of Integer arrays which contain the most
     *                  similar arrays to search.
     */
    private static ArrayList<int[]> getMatches(int[] search, ArrayList<int[]> full, int min) {
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
    
    /**
     * Returns the total of all the dice.
     * 
     * @param rolls The roll to be used.
     * @return      The total of all the dice.
     */
    private static int getTotalOfDice(Dice[] rolls) {
        int count = 0;
        
        for (int i = 0; i < rolls.length; i++) {
            count += rolls[i].face;
        }
        return count;
    }
    
    /**
     * Returns the score of the amount of a recurring elements.
     * 
     * @param n     The minimum amount of dice that should
     *              appear in rolls.
     * @param rolls The roll to be used.
     * @return      The score of the amount of a recurring elements.
     */
    private static int getNOfAKind(int n, Dice[] rolls) {
        for (int i = 1; i <= 6; i++) {
            if (getNumberOfDice(i, rolls) >= n) return i * n;
        }
        return 0;
    }
}
