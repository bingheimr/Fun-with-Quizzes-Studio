package com.company;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;

    public Quiz(){
        questions = new ArrayList<>();
        questions.add(new MultipleChoice("Question 1", new ArrayList<>()));
        questions.add(new Checkbox("Question 2", new ArrayList<>()));
    }

    public ArrayList getQuestions(){
        return questions;
    }

}


