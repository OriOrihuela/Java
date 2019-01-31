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

    public int getStrike() {
        return this.STRIKE;
    }

    public int getSpare() {
        return this.SPARE;
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
            char nextResult = scoreCard.charAt(roll + 1);

            if (isSpare(result)) {
                if (!isStrike(nextResult)) {
                    updateTotalScore(computeSpare(result) + computePins(nextResult) - computePins(scoreCard.charAt(roll - 1)));
                }
                else if (isStrike(nextResult)) {
                    updateTotalScore(computeSpare(result) + computeStrike(nextResult) - computePins(scoreCard.charAt(roll - 1)));
                }
            }
            if (isStrike(result)) {
                char nextResult2 = scoreCard.charAt(roll + 2);
                if (isStrike(nextResult) && isStrike(nextResult2)) {
                    updateTotalScore(computeStrike(result) + computeStrike(nextResult) + computeStrike(nextResult2));
                }
                else if (isStrike(nextResult) && !isStrike(nextResult2)) {
                    updateTotalScore(computeStrike(result) + computeStrike(nextResult) + computePins(nextResult2));
                }
            }
            else {
                updateTotalScore(computePins(result));
            }
        }
        return getTotalScore();
    }
}