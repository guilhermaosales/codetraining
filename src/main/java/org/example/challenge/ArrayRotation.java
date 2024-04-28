package org.example.challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {

        int[] solution = solution(new int[]{3, 8, 9, 7, 6}, 3);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] A, int K) {

        int[] rotationalInt = new int[A.length];
        ArrayList<int[]> arrayList = new ArrayList<>();

        if (K == 1 || A.length == 0) {
            return A;
        }

        for (int i = 1; i <= K; i++ ) {
            rotationalInt[0] = A[A.length - 1];
            for (int j = 1; j < A.length; j++) {
                rotationalInt[j] = A[j - 1];
            }
            A = rotationalInt;
            arrayList.add(rotationalInt);
            rotationalInt = new int[A.length];
        }
        return arrayList.get(K -1);
    }

//    public static int[] solution(int[] A, int K) {
//
//        if (A.length == 0 || K % A.length == 0) {
//            return A;  // No rotation needed
//        }
//
//        int rotations = K % A.length;  // Reduce rotations to avoid redundant cycles
//        int[] result = new int[A.length];
//
//        for (int i = 0; i < A.length; i++) {
//            int newIndex = (i + rotations) % A.length;
//            result[newIndex] = A[i];
//        }
//
//        return result;
//    }
}
