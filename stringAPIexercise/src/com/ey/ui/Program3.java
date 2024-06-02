
package com.ey.ui;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a PAN number: ");
        String pan = scanner.nextLine();
        if (validatePAN(pan)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        scanner.close();
    }

    public static boolean validatePAN(String pan) {
        if (pan.length()!= 8) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(pan.charAt(i)) ||!Character.isUpperCase(pan.charAt(i))) {
                return false;
            }
        }
        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(pan.charAt(i))) {
                return false;
            }
        }
        if (!Character.isLetter(pan.charAt(7)) ||!Character.isUpperCase(pan.charAt(7))) {
            return false;
        }
        return true;
    }
}