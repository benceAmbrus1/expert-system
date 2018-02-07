package com.codecool;

public class ESProvider {
    FactParser factParser;
    RuleParser ruleParser;

    public ESProvider(FactParser factParser, RuleParser ruleParse){
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }
}
