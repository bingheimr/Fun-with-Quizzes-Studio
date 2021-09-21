package com.company;

import java.util.ArrayList;

public class Checkbox extends Question {

    public Checkbox(String question, ArrayList<String> correctResponse) {
        super(question, correctResponse);
    }

    @Override
    public void answer(String userResponse) {
        String[] foo = userResponse.split(",");
        for (String x: foo) {
            this.userResponse.add(x);
        }
    }
}
