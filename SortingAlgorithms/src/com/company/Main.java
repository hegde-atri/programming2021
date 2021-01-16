package com.company;

import java.util.Arrays;

public class Main {

    private static int[] numsToSort = {34, 67, 23, 78, 12, 234, 6758, 1234, 5426, 123};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numsToSort));
        bubbleSortRecursive(numsToSort, numsToSort.length);
        System.out.println(Arrays.toString(numsToSort));
    }


    /*
    Bubble sort compares adjacent values, and if a value goes till the last position,
    it makes that the final. So once 6758 has reached the end in the first pass, its position is now final
    adjacent values are passed till all the values are in this final state.
    we do n-i-1 in the second for loop is so that we don't compare any values that are final
     */
    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }


    /*
    recursive styled bubbleSort, nothing special about it but understanding how it works is impressive
     */
    public static void bubbleSortRecursive(int arr[], int n) {
        if (n == 1)
            return;
        // One pass of bubble sort. After this pass, the largest element is moved (or bubbled) to end.
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
            }

        bubbleSortRecursive(arr, n - 1);
    }






}
