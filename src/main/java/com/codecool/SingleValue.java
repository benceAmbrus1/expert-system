package com.codecool;

public class SingleValue extends Value{

    String param;
    boolean selectionType;

    public SingleValue(String param, boolean selectionType){
        this.param = param;
        this.selectionType = selectionType;
    }
}
