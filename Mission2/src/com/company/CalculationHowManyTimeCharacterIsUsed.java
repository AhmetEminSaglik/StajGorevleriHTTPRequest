package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class CalculationHowManyTimeCharacterIsUsed {
    String[] words;
    ArrayList<CharacterUsingCard> list = new ArrayList<>();

    public CalculationHowManyTimeCharacterIsUsed(String[] words) {
        this.words = words;
    }

    public void calculateChractersInText() {

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toUpperCase(new Locale("tr"));
            for (int j = 0; j < words[i].length(); j++) {

                char character = words[i].charAt(j);
                calculateCharacter(character);
            }
        }

    }

    void calculateCharacter(char character) {
        for (int i = 0; i < list.size(); i++) {
            if (character == (list.get(i).getCharacter())) {
                list.get(i).increaseUsedTimeValue();
                return;
            }
        }
        addlist(character);

    }

    void addlist(char character) {
        if (list.size() == 0) {
            list.add(new CharacterUsingCard(character));
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCharacter() > character) {
                    list.add(i, new CharacterUsingCard(character));
                    return;
                }
            }
            list.add(new CharacterUsingCard(character));
        }

    }

    public void printList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getCharacter() + " => " + list.get(i).getTotalUsedTime());
        }
    }

}
