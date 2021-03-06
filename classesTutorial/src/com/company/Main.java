package com.company;

public class Main {


    public static void main(String[] args) {


    }



    public static void forEachLoop(){
        //The variable x is automatically given the next value of nums and the for loop ends when it has cycled through all the values of num, preventing and boundary errors and presenting a more streamlined code
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;
        for (int x: nums){
            System.out.println("Value is: " + x);
            sum+=x; //can stop by using if statement and stopping when the sum is a certain value (by using break)
        }
        System.out.println("Total sum is equal to: " + sum);
    }
}
