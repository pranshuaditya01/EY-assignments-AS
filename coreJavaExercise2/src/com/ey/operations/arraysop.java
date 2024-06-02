package com.ey.operations;

public class arraysop {

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int findSecondHighest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public int findSecondLowest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return secondMin;
    }

    public int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public double findAverage(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    public int[] sortAscending(int[] arr) {
        int[] sortedArr = arr.clone();
        java.util.Arrays.sort(sortedArr);
        return sortedArr;
    }

    public int[] sortDescending(int[] arr) {
        int[] sortedArr = sortAscending(arr);
        int n = sortedArr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[n - i - 1];
            sortedArr[n - i - 1] = temp;
        }
        return sortedArr;
    }
}
