package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, ArrayList<String> correctResponse) {
        super(question, correctResponse);
    }

    @Override
    public void answer(String userResponse) {
        this.userResponse.add(userResponse);
    }
}
