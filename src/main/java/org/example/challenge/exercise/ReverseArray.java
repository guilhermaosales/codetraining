package org.example.challenge.exercise;

import java.util.ArrayList;

public class ReverseArray {

    public static void main(String[] args) {

        ArrayList<Integer> reverseArray = toReverse(new int[]{1, 2, 3, 4, 5});
        System.out.println(reverseArray);

    }

    private static ArrayList<Integer> toReverse(int[] ints) {
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i = ints.length - 1; i >= 0; i--) {
            newArray.add(ints[i]);
        }

        return newArray;
    }
}
