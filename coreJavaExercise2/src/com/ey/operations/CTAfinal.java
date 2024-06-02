package com.ey.operations;


public class CTAfinal {

    public static void main(String[] args) {
        colourSwitch colourSwitch = new colourSwitch();
        System.out.println(colourSwitch.getColor('r')); // Should print "Red"
        System.out.println(colourSwitch.getColor('g')); // Should print "Green"

        int[] numbers = {15, 34, 8, 31, 92, 7};

        arraysop arrayOps = new arraysop();

        System.out.println("Max: " + arrayOps.findMax(numbers));
        System.out.println("Min: " + arrayOps.findMin(numbers));
        System.out.println("Second Highest: " + arrayOps.findSecondHighest(numbers));
        System.out.println("Second Lowest: " + arrayOps.findSecondLowest(numbers));
        System.out.println("Sum: " + arrayOps.findSum(numbers));
        System.out.println("Average: " + arrayOps.findAverage(numbers));

        int[] sortedAsc = arrayOps.sortAscending(numbers);
        System.out.println("Sorted Ascending: " + java.util.Arrays.toString(sortedAsc));

        int[] sortedDesc = arrayOps.sortDescending(numbers);
        System.out.println("Sorted Descending: " + java.util.Arrays.toString(sortedDesc));
    }
}
