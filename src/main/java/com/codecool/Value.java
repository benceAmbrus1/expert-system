package com.codecool;

import java.util.List;

public abstract class Value {

    protected boolean selectionType;
    private List<String> inputPatter;

    public List<String> getInputPattern() {
        return inputPatter;
    }

    public boolean getSelectionType() {
        return selectionType;
    }
}
