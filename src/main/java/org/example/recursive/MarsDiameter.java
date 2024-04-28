package org.example.recursive;

public class MarsDiameter {

    static int marsDiameter(int num) {
        if (num == 0) {
            return 0;
        } else {
            // get last number
            return (num % 10);
        }
    }

    static Boolean isEven(int number) {
        return ((number % 10) % 2 == 0);
    }

    public static void main(String args[]) {
        System.out.println("The number of digits in the 'diameter of Mars': " + marsDiameter(7623));
    }
}
