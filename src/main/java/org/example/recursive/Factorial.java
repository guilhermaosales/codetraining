package org.example.recursive;

public class Factorial {

    static int factorial(int n){
        if(n == 1){ // base case
            return 1;
        } else {
            return n*factorial(n-1); // recursive case
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(3)); // we expect 6 (3 * 2 * 1)
    }
}
