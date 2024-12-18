package com.rbogaveev.lesson3;

import java.util.Scanner;

public class main {

    public static void main(String[] args){
        byte b = 1;
        int a = 10;
        //System.out.println(b+a); // int

        for (int  i= 0; i<0;i+=2){
            System.out.println(i);
        }

        int i = 0;
        while (i<0) {
            System.out.println(i);
            i+=2;
        }

        do {
            //System.out.println(i);
            i++;
        }
        while (i<0);

        a = 10;
        print(a);
        System.out.println(a);

        String s = "test";
        changeString(s);
        System.out.println(s);

        int[] array = new int[10];
        array[0] = 0;
        array[1] = 0;



        Scanner scanner  = new Scanner(System.in);
        for (i=0;i<10;i++) {
            array[i] = scanner.nextInt();
        }
        //

        for (i=0;i<10;i++){
            System.out.println(array[i]);
        }

    }

    public static void changeString(String s){
        s = "test2";
    }

    public static void print(int a){
        a = a + 5;
        System.out.println("printing a=" + a);
    }


    public static int calculateRectangleSquare(int a, int b){
        return a*b;
    }

    public static int calculateRectangleSquare(int a){
        return a*a;
    }
}
