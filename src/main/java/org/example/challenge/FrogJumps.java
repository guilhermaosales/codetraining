package org.example.challenge;

public class FrogJumps {

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30)); // 3
    }

    private static int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
