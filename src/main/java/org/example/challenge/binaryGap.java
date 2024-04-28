package org.example.challenge;

import java.util.Arrays;

public class binaryGap {

    public static void main(String[] args) {
        int solution = solution(1041);
        System.out.println(solution);
    }

    static public int solution(int N) {
        String numberAsBinary = Integer.toBinaryString(N);
        int hitZero = 0;
        int longest = 0;

        for (int i = 0; i < numberAsBinary.length() ; i++) {
            if (numberAsBinary.charAt(i) == '1') {
                if (hitZero > longest) longest = hitZero;
                hitZero = 0;
            }
            else { hitZero++;}
        }

        return longest;
    }

}
