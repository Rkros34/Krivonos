package by.it_academy.lesson10_11;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    private Map<String, String> mapAbbrevWithExplan = new HashMap<>();


    void addAbbreviation(String abbreviation, String explanation) {
        mapAbbrevWithExplan.put(abbreviation, explanation);
    }

    boolean hasAbbreviation(String abbriviation) {
        return mapAbbrevWithExplan.containsKey(abbriviation);
    }

    String findExplanationFor(String abbreviation) {
        return mapAbbrevWithExplan.get(abbreviation);
    }

    void printAbbreviation() {
        for (String key:mapAbbrevWithExplan.keySet()) {
            System.out.println(key);
        }
    }

    void printAbbreviationWhere(String text) {
        for (String key:mapAbbrevWithExplan.keySet()) {
            if (key.contains(text)){
                System.out.println(key);
            }
        }
    }
    void printExplanationOfAbbreviationWhere(String text){
        for (String key:mapAbbrevWithExplan.keySet()) {
            if (key.contains(text)){
                System.out.println(mapAbbrevWithExplan.get(key));
            }
        }
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("JDK", "Java Development Kit");
        abbreviations.addAbbreviation("JRE", "Java Runtime Enviroment");
        abbreviations.addAbbreviation("JVM", "Java Virtual Machine");
        abbreviations.addAbbreviation("CRM", "Customer relationship management");
        abbreviations.addAbbreviation("API", "Application program interface");
        System.out.println(abbreviations.hasAbbreviation("JDR"));
        abbreviations.addAbbreviation("JDR", "Jura Denis Rustam");
        System.out.println(abbreviations.hasAbbreviation("JDR"));
        System.out.println(abbreviations.findExplanationFor("JDK"));
        abbreviations.printExplanationOfAbbreviationWhere("J");
        abbreviations.printAbbreviation();
        abbreviations.printAbbreviationWhere("JDK");
    }
}
