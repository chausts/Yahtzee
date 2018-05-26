public class Examiner
{
    public Examiner() {}
    
    public int getDiceAmount(Roll roll, int category) {
        int amount = 0;
        
        for (int i = 0; i < roll.rolls.length; i++) {
            amount += (category + 1 == roll.rolls[i].face) ? 1 : 0;
        }
        
        return amount;
    }
    
    public int getTotalScore(Roll roll) {
        int total = 0;
        for (int i = 0; i < roll.rolls.length; i++) {
            total += roll.rolls[i].face;
        }
        return total;
    }
    
    public int getNOfAKindScore(Roll roll, int n) {
        for (int i = 0; i < roll.rolls.length; i++) {
            if (getDiceAmount(roll, n) >= n) {
                return getTotalScore(roll);
            }
        }
        return 0;
    }
    
    public int getStraightScore(Roll roll, int straightLength) {
        int num = 0;
        for (int i = 1; i <= 6; i++) {
            num += (getDiceAmount(roll, i) == 1) ? 1 : 0;
        }
        return (num >= straightLength) ? (10 * straightLength) - 10 : 0;
    }
    
    public int getFullHouseScore(Roll roll) {
        int first = 0;
        int second = 0;
        
        for (int i = 1; i <= 6; i++) {
            if (getDiceAmount(roll, i) == 3) {
                first = i;
            } else if (getDiceAmount(roll, i) == 2) {
                second = i;
            }
        }
        
        return (first > 0 && second > 0) ? 25 : 0;
    }
    
    public int getCategoryScore(Scorecard scorecard, Roll roll, int category) {
        int score = 0;
        
        if (category >= Scorecard.ACES && category <= Scorecard.SIXES){
            score = getDiceAmount(roll, category);
        } else if(category == Scorecard.THREE_OF_A_KIND) {
            score = getNOfAKindScore(roll, 3);
        } else if (category == Scorecard.FOUR_OF_A_KIND) {
            score = getNOfAKindScore(roll, 4);
        } else if (category == Scorecard.FULL_HOUSE) {
            score = getFullHouseScore(roll);
        } else if (category == Scorecard.SMALL_STRAIGHT) {
            score = getStraightScore(roll, 4);
        } else if (category == Scorecard.LARGE_STRAIGHT) {
            score = getStraightScore(roll, 5);
        } else if (category == Scorecard.CHANCE) {
            score = getTotalScore(roll);
        } else if (category == Scorecard.YAHTZEE) {
            score = getNOfAKindScore(roll, 5);
        }
        
        return score;
    }
    
    
    public int getOptimalCategory(Scorecard scorecard, Roll roll) {
        int optimalCategoryIndex = 0;
        int optimalCategoryScore = 0;
        
        Dice[] rolls = roll.rolls;
        int[] scores = scorecard.scores;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != -1) continue;
            
            int categoryScore = getCategoryScore(scorecard, roll, i);
        }
        
        return optimalCategoryIndex;
    }
}
