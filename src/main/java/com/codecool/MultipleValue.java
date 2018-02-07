package com.codecool;

import java.util.List;

public class MultipleValue extends Value {

    List<String> params;
    boolean selctionType;

    public MultipleValue(List<String> params, boolean selctionType){
        this.params = params;
        this.selctionType = selctionType;
    }
}
