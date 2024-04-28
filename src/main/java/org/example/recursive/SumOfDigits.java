package org.example.recursive;

public class SumOfDigits {

    static int sumOfDigits(int num) {
        // Base case: if num is less than 10, return num itself
        if(num < 10) {
            return num;
        }
        else {
            return num % 10 + sumOfDigits(num / 10); // Recursive case
        }
    }

    public static void main(String args[]) {
        System.out.println(sumOfDigits(12345)); // Will print out 15 (1+2+3+4+5)
    }
}
