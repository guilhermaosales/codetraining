package org.example.recursive;

public class CountEvenDigits {

    static int countEvenDigits(int num) {
        if (num % 10 % 2 == 0) {
            return 1;
        } else {
            // Recursive case: reduce the number by dividing by 10 and count the rest
//            int counter = 0;
//            if (num % 10 % 2 == 0) {
//                counter += 1;
//            }
            return 1 + countEvenDigits(num / 10);
        }
    }

    public static void main(String args[]) {
        System.out.println("The number of digits in the 'diameter of Mars': " + countEvenDigits(7623));
    }
}
