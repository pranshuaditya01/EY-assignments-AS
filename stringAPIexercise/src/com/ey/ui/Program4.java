package com.ey.ui;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a separator character: ");
        char separator = scanner.next().charAt(0);
        System.out.println(reshape(str, separator));
        scanner.close();
    }

    public static String reshape(String str, char separator) {
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reversedStr.length(); i++) {
            result.append(reversedStr.charAt(i));
            if (i < reversedStr.length() - 1) {
                result.append(separator);
            }
        }

        return result.toString();
    }
}