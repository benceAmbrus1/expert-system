package com.codecool;

import java.util.List;

public class SingleValue extends Value{

    public String param;

    public SingleValue(String param, boolean selectionType){
        this.param = param;
        this.selectionType = selectionType;
    }

    public String getParam() {
        return param;
    }
}

