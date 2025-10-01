package com.pluralsight;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine().trim();

        String[] nameparts = fullName.split("\\s+");// "\\s+ means split at one or more spaces, so it ignores extra spaces between words".
        String first = nameparts[0];
        String middleName;
        String lastName;


        if (nameparts.length == 2) {//Check if the name has exactly two words. If yes, then there’s no middle name.
            middleName = " ";
            lastName = nameparts[1]; // no middle name
        } else{
            middleName = nameparts[1]; // middle name
            lastName = nameparts[2];   // last name
        }


        // Result
        System.out.println("First name: " + first);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}