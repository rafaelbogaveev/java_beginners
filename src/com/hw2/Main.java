package com.hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        //Arrays.sort(numbers);
        Sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void Sort(int[] numbers){
        //5, 2, 9, 1, 5, 6
        //2, 5, 1, 5, 6, 9
        //2, 1, 5, 5, 6, 9
        //1, 2, 5, 5, 6, 9
    }

    public static int getMin(int[] numbers){

    }
}