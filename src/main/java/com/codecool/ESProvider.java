package com.codecool;

import java.util.HashMap;

public class ESProvider {

    private FactRepository factRepository;
    private RuleRepository ruleRepository;

    ESProvider(FactParser fact, RuleParser rule) throws Exception {
        this.factRepository = fact.getFactRepository();
        this.ruleRepository = rule.getRuleRepository();
    }

    public FactRepository getFactRepository() {
        return factRepository;
    }

    public RuleRepository getRuleRepository() {
        return ruleRepository;
    }
}
