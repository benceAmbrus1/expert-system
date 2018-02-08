package com.codecool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fact {

    private String id;
    private String description;
    private Map<String, Boolean> values = new HashMap<>();

    public Fact(String id, String description){
        this.id = id;
        this.description = description;
    }

    public Set<String> getIdSet() {

        return null;
    }

    public void setFactValueById(String id, boolean value) {
        values.put(id, value);
    }

    public boolean getValueById(String id) {

        return values.get(id);
    }

    public String getDescription() {

        return description;
    }
}
