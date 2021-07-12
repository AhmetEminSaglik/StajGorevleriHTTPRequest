package com.company;

import java.util.Scanner;

public class Main {
    /*  K & k  ayni mi?
     *  Abc  C B A  -->? A B C cbA
     *
     * Kelimeleri al
     * aradaki bosluklari at
     *
     * 3 -> 1   4 -> 2
     * i=0; i<Lenght/2; i++ { charat(i).equal(charAt(Length-1-i))} true & false
     *
     *AbcCBA
     * Abc7CBA
     * Abc */
    public static void main(String[] args) {

        ControlClass controlClass = new ControlClass();
        Scanner scanner = new Scanner(System.in);
        String text = "";

        while (true) {
            System.out.println("Please enter text : ");
            text = scanner.nextLine();

            checkUserExitRequest(text);
            try {
                System.out.println(controlClass.controlText(text));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }

    static void checkUserExitRequest(String text) {
        if (text.equals("exit")) {
            System.exit(0);
        }
    }
}

