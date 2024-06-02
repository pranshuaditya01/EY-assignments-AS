package com.ey.ui;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //input from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();  // to scan from next line
        
        System.out.println(getCapitalized(sentence));  // getCapitalized is a method we have created below
        scanner.close();
    }

    public static String getCapitalized(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder(); // use constructor to call methods

        for (String word : words) {
            capitalizedSentence.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        } // this loop is responsible for the modification of the first letter of every word
          //(called as substring here) to capital letter and then re form the new string

        return capitalizedSentence.toString().trim();
    }
}