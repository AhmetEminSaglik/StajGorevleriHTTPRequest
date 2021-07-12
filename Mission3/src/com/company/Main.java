package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyHttpConnection myConnection = new MyHttpConnection();

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Please enter input value : ");
            input = scanner.nextLine();
            if (input.equals("exit"))
                System.exit(0);

            myConnection.printInformations(input);

        }
    }
}
