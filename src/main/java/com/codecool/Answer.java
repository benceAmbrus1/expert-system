package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Answer {

    private List<Value> values = new ArrayList<>();

    public boolean evaluateAnswerByInput(String input) throws Exception {
        return true;
    }

    public void addValue(Value value) {
        values.add(value);
    }


    public List<Value> getValues() {

        return values;
    }
}
