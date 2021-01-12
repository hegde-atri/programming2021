package com.company;

import java.util.Arrays;

public class Main {

    private static int[] numsToSort= {34, 67, 23 ,78, 12, 234, 6758, 1234, 5426, 123};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numsToSort));
        bubbleSort(numsToSort);
        System.out.println(Arrays.toString(numsToSort));
    }


    /*
    Bubble sort compares adjacent values, and if a value goes till the last position,
    it makes that the final. So once 6758 has reached the end in the first pass, its position is now final
    adjacent values are passed till all the values are in this final state.
    we do n-i-1 in the second for loop is so that we don't compare any values that are final
     */
    public static void bubbleSort(int nums[]){
        int n = nums.length;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n -i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

    }
}
