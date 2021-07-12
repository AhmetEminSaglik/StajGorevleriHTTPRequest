package com.company;

public class Sentence {
    String text;
    Conjunction conjunction = new Conjunction();
    CalculationHowManyTimeCharacterIsUsed calculationHowManyTimeCharacterIsUsed;
    String[] words;

    public Sentence(String text) {
        this.text = text;
    }

    public void printTotalCharatersInText() {
        System.out.println("Number of Repetitions of Characters in a Sentence: ");
        calculationHowManyTimeCharacterIsUsed = new CalculationHowManyTimeCharacterIsUsed(words);
        calculationHowManyTimeCharacterIsUsed.calculateChractersInText();
        calculationHowManyTimeCharacterIsUsed.printList();
    }

    public void reverseWordsByOrderInSentence() {
        splitWordsBySpaceInText();
        text = "";
        for (int i = words.length - 1; i >= 0; i--) {
            text += addWordByRule(words[i]) + " ";

        }
        System.out.println(text);
    }

    void splitWordsBySpaceInText() {
        words = text.split(" ");
    }

    public boolean isWordConjunction(String text) {
        for (int i = 0; i < conjunction.getLength(); i++) {
            if (text.equals(conjunction.getConjunctionByIndex(i))) {
                return true;
            }
        }
        return false;
    }

    public String addWordByRule(String text) {
        if (isWordConjunction(text) == true) {
            return reverseWord(text);
        } else {
            return text;
        }
    }

    public String reverseWord(String text) {
        String newText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            newText += text.charAt(i);
        }
        return newText;
    }
}
