package com.codecool;

import java.util.List;

public class MultipleValue extends Value {

    public MultipleValue(List<String> params, boolean selectionType) {
        this.inputPatter = params;
        this.selectionType = selectionType;
    }

}
