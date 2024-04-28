package org.example.challenge;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 1, 5})); // 4
    }

    private static int solution(int[] A) {
        int n = A.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i : A) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}
