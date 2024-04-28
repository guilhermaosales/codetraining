package org.example.leetcode;

import java.util.Arrays;

public class RunningSum1dArray {

    public static void main(String[] args) {

        int[] result = solution(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] nums) {
        int[] result = new int[nums.length];

        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            result[j] = sum;
        }

        return result;
    }
}
