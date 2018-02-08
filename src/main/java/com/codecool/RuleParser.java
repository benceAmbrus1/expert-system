package com.codecool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RuleParser extends XMLParser {

    public RuleRepository getRuleRepository() throws Exception {

        loadXmlDocument("rules.xml");
        Document doc = getDoc();
        NodeList nList = doc.getElementsByTagName("Rule");
        RuleRepository ruleRepository = new RuleRepository();
        for (int temp = 0; temp < nList.getLength() ; temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String id = eElement.getAttribute("id");
                String question = eElement.getElementsByTagName("Question").item(0).getTextContent();
                NodeList answerList = eElement.getElementsByTagName("Answer");
                for (int temp2 = 0; temp2 < answerList.getLength(); temp2++) {
                    Node mNode = answerList.item(temp2);
                    if (mNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element answer = (Element) mNode;
                        NodeList seletcions = answer.getElementsByTagName("Selection");
                        Answer answers = new Answer();
                        for(int temp3 = 0; temp3 < seletcions.getLength(); temp3++) {
                            Node bNode = seletcions.item(temp3);
                            if (bNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element selection = (Element) bNode;
                                boolean selectionType = Boolean.parseBoolean(selection.getAttribute("value"));
                                String param = selection.getElementsByTagName("SingleValue").item(0).getAttributes().getNamedItem("value").getNodeValue();
                                Value value = new SingleValue(param, selectionType);
                                answers.addValue(value);
                            }
                        }
                        Question question1 = new Question(id, question, answers);
                        ruleRepository.addQuestion(question1);
                    }
                }
            }
        }
        return ruleRepository;
    }
}
