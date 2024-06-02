package com.ey.ui;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // to scan the next integer for input
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
       
        // the loop will scan all integers individually and append them into the array
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println(findMaxDistance(array, n)); // the findMaxDistance method is created below
        
        scanner.close();
    }

    public static Integer findMaxDistance(int[] array, int n) {
        int maxDiff = 0;
        int index = 0;

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);

            if (diff > maxDiff) {
                maxDiff = diff;
                index = i + 1;
            }
        }

        return index;
    }
}