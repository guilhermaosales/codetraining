package org.example.iterations;

import java.util.HashMap;

public class FrequentVisitors {
    public static void main(String[] args) {

        FrequentVisitors visitors = new FrequentVisitors();
        int[] visits1 = {1,2,3,1,2,3,1,2,3,1};
        int frequentUser1 = visitors.frequentUser(visits1);
        System.out.println("Frequent User: " + frequentUser1);  // Expected output: 1

        int[] visits2 = {5,0,5,0,5,0,5,0,1,1,1,1,1};
        int frequentUser2 = visitors.frequentUser(visits2);
        System.out.println("Frequent User: " + frequentUser2);  // Expected output: 5

        int[] visits3 = {3,2,2,1,3,2,3,0,0,1,4,1};
        int frequentUser3 = visitors.frequentUser(visits3);
        System.out.println("Frequent User: " + frequentUser3);  // Expected output: -1
    }

    public int frequentUser(int[] visits) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int frequentVisitThreshold = visits.length / 4;

        for (int visitor : visits) {
            if (visitor != 0 ) {
                countMap.put(visitor, countMap.getOrDefault(visitor, 0) + 1);
                if (countMap.get(visitor) > frequentVisitThreshold) {
                    return visitor;
                }
            }
        }

        // implement this
        return -1;
    }
}
