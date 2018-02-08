package com.codecool;

import java.util.*;

public class RuleRepository {

    public List<Question> questions = new ArrayList<>();

    public void addQuestion(Question question){

        questions.add(question);
    }

    public Iterator<Question> getIterator(){
        return new QuestionIterator(questions);
    }
}
