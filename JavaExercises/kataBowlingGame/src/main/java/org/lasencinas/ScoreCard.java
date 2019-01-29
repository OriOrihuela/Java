package org.lasencinas;

public class ScoreCard {

    // Properties of the class //
    private int STRIKE = 10;
    private int ZERO = 0;
    private int rolls = 0;
    private String scoreCard = "";
    private int totalScore = 0;
    private String pins = "-123456789";

    // Constructor //
    public ScoreCard() {
        this.scoreCard = "";
        this.rolls = 0;
    }

    public ScoreCard(String scoreCard) {
        this.scoreCard = scoreCard;
        this.rolls = scoreCard.length();
    }

    // Setters and getters of the class //
    public String getScoreCard() {
        return this.scoreCard;
    }

    public int getRolls() {
        return this.rolls;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    // Behaviours //
    private void updateTotalScore(int score) {
        this.totalScore += score;
    }

    public int computePins(String pins) {
        return this.pins.indexOf(pins);
    }

    public int getSTRIKE() {
        return this.STRIKE;
    }

    public int computeStrike(char strike) {
        if (strike == 'X') {
            return getSTRIKE();
        }
        else {
            return 0;
        }
    }

    public int calculateScore(){

        for(int i = 0; i < getScoreCard().length(); i++){

            char pin = getScoreCard().charAt(i);

            if (pin == 'X') {
                updateTotalScore(computeStrike(pin));
            }
            if (pin == '/') {
                updateTotalScore(10);
            }
            else {
                updateTotalScore(computePins(i));
            }
        }
        return this.totalScore;
    }
}
