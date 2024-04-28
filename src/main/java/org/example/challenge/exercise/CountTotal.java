package org.example.challenge.exercise;

public class CountTotal {

    public static void main(String[] args) {
        System.out.println(countTotal(15));
    }

    private static int countTotal(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += 1;
        }
        return result;
    }
}
