package com.codecool;

import java.util.Iterator;
import java.util.List;

public class FactIterator implements Iterator<Fact> {


    private List<Fact> facts;
    private int current;

    public FactIterator(List<Fact> facts) {
        this.facts = facts;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < facts.size();
    }

    @Override
    public Fact next() {
        int curr = current;
        current++;
        return facts.get(curr);
    }
}
