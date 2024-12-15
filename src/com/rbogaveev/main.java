package com.rbogaveev;

public class main {


    public static void main(String[] args) {
        System.out.println("Calculation square of the rectangle");
        int height = 6;
        int width = 9;
        System.out.println("Square of the rectangle: " + calculateRectangleSquare(height, width));
        byte b = 10;
        System.out.println(b);
        b = (byte)(b * b);
        System.out.println(b);
        b = (byte)(b * b);
        System.out.println(b);
        b = (byte)(129);
        System.out.println(b);
        double d = 100d;
        String s = "Hello World ";
        System.out.println(s);


        int a = 100;
        b  = 0;
        a = b;
        b = (byte)a;

        String name = "Kamil";
        System.out.println(s + name);
        System.out.println(a+b);
        a = 5;
        b = 2;
        int ratio = a/b;
        System.out.println(ratio);
        double ratiof = (double) a/(double) b;
        System.out.println(ratiof);
        long l = 8l;

    }

    public static int calculateRectangleSquare(int width, int height){
        return width * height;
    }

}
