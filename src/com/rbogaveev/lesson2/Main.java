package com.rbogaveev.lesson2;

public class Main {
    public static void main(String[] args) {
        byte a = 5;
        byte b = -5;
        System.out.println("Number=" + a + "; binary string: " + Integer.toBinaryString(a));
        System.out.println("Number=" + b + "; binary string: " + Integer.toBinaryString(b));
        System.out.println("Number=" + a + "; binary string of ~: " + Integer.toBinaryString(~a));
        System.out.println(~a);

        System.out.println("a=" + a + ", b="+b+" ; binary a|b: " + Integer.toBinaryString(a|b));
        System.out.println("a=" + a + ", b="+b+" ; a|b: " + (a|b));

        System.out.println("a=" + a + ", b="+b+" ; binary a&b: " + Integer.toBinaryString(a&b));
        System.out.println("a=" + a + ", b="+b+" ; a&b: " + (a&b));

        System.out.println("a=" + a + ", b="+b+" ; binary a^b: " + Integer.toBinaryString(a^b));
        System.out.println("a=" + a + ", b="+b+" ; a&b: " + (a^b));

        a = 16;
        System.out.println("a=" + a + "; binary string: " + Integer.toBinaryString(a));
        System.out.println("a=" + a + "; binary string of a >> 1: " + Integer.toBinaryString(a >> 1));
        System.out.println("a=" + a + "; a >> 1: " + (a >> 1));

        a = 16;
        System.out.println("a=" + a + "; binary string: " + Integer.toBinaryString(a));
        System.out.println("a=" + a + "; binary string of a << 1: " + Integer.toBinaryString(a << 2));
        System.out.println("a=" + a + "; a >> 1: " + (a << 2));
        a = 11;
        if (a == 10) {
            System.out.println("A is equal to 10");
        }
        else if (a >= 10) {
            System.out.println("A is more than 10");
        }
        else {
            System.out.println("A is less than 10");
        }

        switch (a) {
            case 10:
                System.out.println("A is equal to 10");
                //break;
            case 11:
                System.out.println("A is equal to 11");
                //break;
            case 12:
                System.out.println("A is equal to 12");
                //break;
            case 9:
                System.out.println("A is equal to 9");
                //break;
            default:
                System.out.println("unexpected behavior");
                //break;
        }


        a = 1;
        b = 10;
        if ( IsEqual10(a)&& IsEqual10(b)) {
            System.out.println("Ok");
        }

        System.out.println("-----------------------");

        if ( IsEqual10(a) & IsEqual10(b)) {
            System.out.println("Ok");
        }
        System.out.println("-----------------------");
        a = 1;
        if (IsEqual10(a) || IsEqual10(b)) {
            System.out.println("Ok");
        }
        System.out.println("-----------------------");

        if (IsEqual10(a) | IsEqual10(b)) {
            System.out.println("Ok");
        }
    }

    public static boolean IsEqual10(int a){
        System.out.println("comparing number with 10");
        return a == 10;
    }
}
