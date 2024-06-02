package com.ey.ui;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println(getLastLetter(sentence));
        scanner.close();
    }

    public static String getLastLetter(String sentence) {
        StringBuilder lastLetters = new StringBuilder();

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                lastLetters.append(Character.toUpperCase(word.charAt(word.length() - 1)));
            }
        }

        return lastLetters.toString();
    }
}