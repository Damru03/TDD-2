package com.wordz.domain;

public class word {

    private final String Word;
    public word(String correctWord) {
        
    }

    public Score guess(String attempt) {
        var score = new Score(Word);
        score.assess( 0, attempt);
        return score;
    }
}
