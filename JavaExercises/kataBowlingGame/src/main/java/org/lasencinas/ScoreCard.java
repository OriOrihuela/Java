package org.lasencinas;

public class ScoreCard {

    // Properties of the class
    private int rolls = 0;
    private String scoreCard = "";
    private int totalScore = 0;

    //Constructor
    public ScoreCard() {
        this.scoreCard = "";
        this.rolls = 0;
    }

    public ScoreCard(String scoreCard) {
        this.scoreCard = scoreCard;
        this.rolls = scoreCard.length();
    }

    //Setters and getters of the class
    public String getScoreCard() {
        return this.scoreCard;
    }

    public int getRolls() {
        return this.rolls;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    private void setTotalScore(int score) {
        this.totalScore = score;
    }

    public int calculateScore(){

        for(int i=0; i < getScoreCard().length(); i++){
            char pin = scoreCard.charAt(i);
            if (pin == 'X') {
                setTotalScore(10);
            } if (pin == '/') {
                setTotalScore(10);
            } if (pin == '-') {
                continue;
            } else {
                // setTotalScore(scoreCard[]);
            }
        }
        return this.totalScore;
    }
}
