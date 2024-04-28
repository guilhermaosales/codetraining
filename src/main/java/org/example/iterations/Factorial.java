package org.example.iterations;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(getFactorial(3));
        System.out.println(getFactorial(4));
    }

    private static int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return number;
        }

        int factorial = 0;
        for (int i = number; i > 1; i--) {
                factorial = number * (number - 1);
        }

        return number;
    }
}
