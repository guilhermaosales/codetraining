package org.example.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeftUnpaired {

    public static void main(String[] args) {
        System.out.println(leftUnpaired(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    private static int leftUnpaired(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : A) {
            if (countMap.get(num) % 2 != 0) {
                return num;
            }
        }

        return -1;
    }
}
