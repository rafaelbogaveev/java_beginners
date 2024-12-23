package com.rbogaveev.lesson4;

import java.util.Arrays;

public class main {
    public static int a =5;
    public static void main(String[] args){
        int a = 10; // ячейка памяти 1. Туда записывается 10


        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = -6;
        array[4] = 10;
        Arrays.sort(array);
        System.out.println(array);
        for (var i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        int[][] array_2d = new int[5][2];
        for (int i = 0; i<array_2d.length; i++){
            for (int j=0; j<array_2d[i].length; j++){
                array_2d[i][j]=i*j + j+i;
            }
        }

        for (int i = 0; i<array_2d.length; i++){
            for (int j=0; j<array_2d[i].length; j++){
                System.out.print(array_2d[i][j]+ " ");
            }
            System.out.println();
        }

        int[][] array_2d_triangle = new int[5][];
        for (int i = 0;i<array_2d_triangle.length; i++){
                array_2d_triangle[i] = new int[i+1];
        }
        System.out.println("-----------------");

        int order =0;
        for (int i = 0; i<array_2d_triangle.length; i++){
            for (int j=0; j<array_2d_triangle[i].length; j++){
                array_2d_triangle[i][j]=order;
                order++;
            }
        }

        for (int i = 0; i<array_2d_triangle.length; i++){
            for (int j=0; j<array_2d_triangle[i].length; j++){
                System.out.print(array_2d_triangle[i][j]+ " ");
            }
            System.out.println();
        }

        a =14;
        System.out.println(a); // Выводим содержимое ячейки №1 (т.е. 14)
        print(a);
        System.out.println(a); // Выводим содержимое ячейки №1 (т.е. 14)

        System.out.println("---------------");
        System.out.println(array[0]); // -6
        System.out.println(array);
        System.out.println("---------------");
        print_array(array); //10
        System.out.println("---------------");
        System.out.println(array[0]); // 10
        System.out.println(array);
    }

    public static void print(int a /* создается ячейка памяти №2 */) {
        a = a+5; // Значение в ячейке памяти №2 менятеся
        System.out.println(a); // Выводим содержимое ячейки №2
    }

    public static void print_array(int[] array){
        array[0] = 10;
        System.out.println(array[0]);
        System.out.println(array);
    }


}
