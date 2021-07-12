package com.company;

public class Conjunction {
    private String[] conjunction = {"ama", "ve", "veya", "göre", "ile", "yalnız", "ise", "ne", "nasıl", "ancak", "çünkü", "neden", "oysa", "için"};

    public String getConjunctionByIndex(int index) {
        return conjunction[index];
    }

    public int getLength() {
        return conjunction.length;
    }
}
