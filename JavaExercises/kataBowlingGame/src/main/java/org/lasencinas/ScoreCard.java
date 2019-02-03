package org.lasencinas;

public class ScoreCard {

    // Properties of the class //

    private int STRIKE = 10;
    private int SPARE = 10;
    private int ZERO = 0;
    private String scoreCard = "";
    private int totalScore = 0;
    private String pins = "-123456789";

    // Constructor //

    public ScoreCard() {
        this.scoreCard = "";
    }

    public ScoreCard(String scoreCard) {
        this.scoreCard = scoreCard;
    }

    // Setters and getters of the class //

    public String getScoreCard() {
        return this.scoreCard;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    // Behaviours //

    public boolean isNormalRoll(char roll) {
        if (roll != 'X' && roll != '/') {
            return true;
        }
        else {
            return false;
        }
    }

    public int computePins(char pin) {
        return this.pins.indexOf(pin);
    }

    public  boolean isStrike(char strike) {
        if (strike == 'X') {
            return true;
        }
        else {
            return false;
        }
    }

    public int computeStrike(char strike) {
        if (strike == 'X') {
            return this.STRIKE;
        } else {
            return this.ZERO;
        }
    }

    public  boolean isSpare(char spare) {
        if (spare == '/') {
            return true;
        }
        else {
            return false;
        }
    }

    public int computeSpare(char spare) {
        if (spare == '/') {
            return this.SPARE;
        } else {
            return this.ZERO;
        }
    }

    public void updateTotalScore(int score) {
        this.totalScore += score;
    }

    public int calculateScore(String scoreCard) {

        for (int roll = 0; roll < scoreCard.length(); roll++) {
            char result = scoreCard.charAt(roll);

            try {
                // Here we check if the result of the actual roll is a Spare.
                if (isSpare(result)) {
                    char nextResult = scoreCard.charAt(roll + 1);
                    char previousResult = scoreCard.charAt(roll - 1);
                    if (!isStrike(nextResult)) {
                        updateTotalScore(computeSpare(result) + computePins(nextResult) - computePins(previousResult));
                    }
                    else if (isStrike(nextResult)) {
                        updateTotalScore(computeSpare(result) + computeStrike(nextResult) - computePins(previousResult));
                    }
                }
                // Here we check if the result of the actual roll is a Strike.
                else if (isStrike(result)) {
                    char nextResult = scoreCard.charAt(roll + 1);
                    char nextResult2 = scoreCard.charAt(roll + 2);
                    if (isStrike(nextResult) && isStrike(nextResult2)) {
                        updateTotalScore(computeStrike(result) * 3);
                        if (roll == scoreCard.length() - 3 && result == 'X') {
                            break;
                        }
                    }
                    else if (isStrike(nextResult) && !isStrike(nextResult2)) {
                        updateTotalScore((computeStrike(result) * 2) + computePins(nextResult2));
                        if (roll == scoreCard.length() - 3 && result == 'X') {
                            break;
                        }
                    }
                    else if (isNormalRoll(nextResult) && isStrike(nextResult2)) {
                        updateTotalScore(computePins(nextResult) + computeStrike(result) * 2);
                        if (roll == scoreCard.length() - 3 && result == 'X') {
                            break;
                        }
                    }
                    else if (isNormalRoll(nextResult) && isSpare(nextResult2)) {
                        updateTotalScore(computeStrike(result) + computeSpare(nextResult2));
                        if (roll == scoreCard.length() - 3 && result == 'X') {
                            break;
                        }
                    }
                    else if (isNormalRoll(nextResult) && isNormalRoll(nextResult2)) {
                        updateTotalScore(computeStrike(result) + computePins(nextResult) + computePins(nextResult2));
                        if (roll == scoreCard.length() - 3 && result == 'X') {
                            break;
                        }
                    }
                }
                // Here we check if the result of the actual roll is any normal pin.
                else if (isNormalRoll(result)) {
                    if (roll == 20 && scoreCard.charAt(19) == '/') {
                        break;
                    }
                    updateTotalScore(computePins(result));
                }
            }
            catch (IndexOutOfBoundsException e) {
                return getTotalScore();
            }
        }
        return getTotalScore();
    }
}