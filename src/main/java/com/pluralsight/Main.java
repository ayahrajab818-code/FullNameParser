package com.pluralsight;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine().trim();




        String first = "";
        String middle = "(none)";
        String last = "";

        String[] parts = fullName.split("\\s+");// "\\s+ means split at one or more spaces, so it ignores extra spaces between words".


        // Result
        System.out.println("First name: " + first);
        System.out.println("Middle name: " + middle);
        System.out.println("Last name: " + last);

    }
}