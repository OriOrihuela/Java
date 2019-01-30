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

    public int getStrike() { return this.STRIKE; }

    public int getSpare() { return this.SPARE; }

    // Behaviours //
    private void updateTotalScore(int score) {
        this.totalScore += score;
    }

    public int computePins(char pin) { return this.pins.indexOf(pin); }

    public int computeStrike(char strike) {
        if (strike == 'X') {
            return getStrike();
        }
        else {
            return this.ZERO;
        }
    }

    public int computeSpare(char spare) {
        if (spare == '/') {
            return this.SPARE;
        }
        else {
            return this.ZERO;
        }
    }

    public int calculateScore(){

        for(int i = 0; i < getScoreCard().length(); i++){

            char roll = getScoreCard().charAt(i);

            if (roll == 'X') {
                updateTotalScore(computeStrike(roll));
            }
            if (roll == '/') {
                updateTotalScore(computeSpare(roll));
            }
            else {
                updateTotalScore(computePins(roll));
            }
        }
        return getTotalScore();
    }
}
