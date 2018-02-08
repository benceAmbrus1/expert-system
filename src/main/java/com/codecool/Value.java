package com.codecool;

import java.util.List;

public abstract class Value {

    boolean selectionType;
    List<String> inputPatter;

    public List<String> getInputPattern() {
        return inputPatter;
    }

    public boolean getSelectionType() {
        return selectionType;
    }
}
