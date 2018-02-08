package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class SingleValue extends Value{

    public SingleValue(String param, boolean selectionType){
        List<String> temp = new ArrayList<>();
        temp.add(param);
        this.inputPatter = temp;
        this.selectionType = selectionType;
    }

}

