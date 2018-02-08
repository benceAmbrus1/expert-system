package com.codecool;

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

    public void collectAnswers(){

    }

    public Boolean getAnswerByQuestion(String questionID){
        return true;
    }

    public String evaluate(){
        return "hi";
    }
}
