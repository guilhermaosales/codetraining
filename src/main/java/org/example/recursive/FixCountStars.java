package org.example.recursive;

public class FixCountStars {

    static int countStars(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + countStars(number / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(countStars(4042)); // Will print the sum of digits of the star code 4042
    }
}
