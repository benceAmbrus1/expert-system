package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactRepository {

    List<Fact> facts = new ArrayList<Fact>();

    public void addFact(Fact fact){
        facts.add(fact);
    }

    public Iterator<Fact> getIterator(){
        return new FactIterator(facts);
    }
}
