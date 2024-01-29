package com.wordz.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Score {
    private final String correct;
    private Letter result = Letter.INCORRECT ;

    public Score(String correct) {
        this.correct = correct;
    }

    public Letter letter(int position) {
        return result;
    }

    public void assess(int position, String attempt) {
        if (isCorrectLetter(position, attempt)){
            result = Letter.CORRECT;
        }
    }
    public void assess(String attempt){
        for (char current: attempt.toCharArray()){
            if (isCorrectLetter(current)){
                result = Letter.CORRECT;
            }
        }
    }    
    private boolean isCorrectLetter ( char currentLetter){
        return correct.charAt(position) == currentLetter;
    } 
    private boolean isCorrectLetter(int position, String attempt) {
        return correct.charAt(position) == attempt.charAt(position);
    }
}
