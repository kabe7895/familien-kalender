package de.meinprojekt;

public class Suggestion {

    private SuggestionType type;
    private String message;
    private double confidenceScore;

    public Suggestion(SuggestionType type, String message, double confidenceScore) {
        this.type = type;
        this.message = message;
        this.confidenceScore = confidenceScore;
    }

    public SuggestionType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public double getConfidenceScore() {
        return confidenceScore;
    }
}