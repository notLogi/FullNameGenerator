package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String firstName = getFirstName(myScanner);

        System.out.println("Middle name: ");
        String middleName;
        middleName = myScanner.nextLine();
        if(!middleName.isEmpty()){
            middleName = middleName.charAt(0) +  ". ";
        }
        String lastName = getLastName(myScanner);

        System.out.println("Suffix: ");
        String suffix = myScanner.nextLine();
        if(!suffix.isEmpty()){
            suffix = ", " + suffix;
        }

        System.out.println("Full name: " + firstName + " " + middleName + lastName + suffix);

    }
    public static String getFirstName(Scanner scanner){
        System.out.println("First name: ");
        return scanner.nextLine();
    }
    public static String getLastName(Scanner scanner){
        System.out.println("Last name: ");
        return scanner.nextLine();
    }
}
