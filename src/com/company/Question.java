package com.company;

import java.util.ArrayList;

public abstract class Question {
    private String question;
    private ArrayList<String> correctResponse;
    protected ArrayList<String> userResponse;

    public Question(String question,ArrayList<String> correctResponse) {
        this.question = question;
        this.correctResponse = correctResponse;
        isCorrect();
    }

    public boolean isCorrect() {
        return correctResponse.equals(userResponse);
    }

    public abstract void answer(String userResponse);

    public String getQuestion() {
        return question;
    }
}
