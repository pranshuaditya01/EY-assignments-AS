
package com.ey.ui;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("The output is: " + calculateWordSum(str));
        scanner.close();
    }

    public static int calculateWordSum(String str) {
        String[] words = str.split(" ");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        if (firstWord.equals(lastWord)) {
            return firstWord.length();
        } else {
            return firstWord.length() + lastWord.length();
        }
    }
}