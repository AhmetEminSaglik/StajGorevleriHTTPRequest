package com.company;

public class CharacterUsingCard {
    int totalUsedTime = 0;
    char character;

    public CharacterUsingCard(char character) {
        this.character = character;
        increaseUsedTimeValue();
    }

    public void increaseUsedTimeValue() {
        totalUsedTime++;
    }

    public char getCharacter() {
        return character;
    }

    public int getTotalUsedTime() {
        return totalUsedTime;
    }
}
