package com.codecool;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        ESProvider esp = new ESProvider(new FactParser(), new RuleParser());
        System.out.println("-------------------------------------------------");
        FactRepository fact = esp.getFactRepository();

        Iterator<Fact> iterator = fact.getIterator();
        while(iterator.hasNext()){

            Fact nextFact = iterator.next();
            System.out.println(nextFact.getDescription());
            System.out.println(nextFact.getValues());

        }
        System.out.println("---------------------------------------------");
        RuleRepository rule = esp.getRuleRepository();

        Iterator<Question> questions = rule.getIterator();
        while(questions.hasNext()){

            Question nextQ = questions.next();
            System.out.println(nextQ.getQuestion());
            System.out.println(nextQ.getId());
            List<Value> values = nextQ.getAnswer().getValues();
            for (Value value:values) {
                System.out.println(((SingleValue) value).getParam());
            }
        }
            System.out.println("------------------------------------------");
    }
}

