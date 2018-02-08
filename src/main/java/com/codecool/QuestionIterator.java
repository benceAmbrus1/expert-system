package com.codecool;

import java.util.Iterator;
import java.util.List;

public class QuestionIterator implements Iterator<Question> {

    private List<Question> questions;
    private int current;

    public QuestionIterator(List<Question> questions ){
        this.questions = questions;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < questions.size();
    }

    @Override
    public Question next() {
        int curr = current;
        current++;
        return questions.get(curr);
    }
}
