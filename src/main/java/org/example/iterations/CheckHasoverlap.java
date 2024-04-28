package org.example.iterations;

import java.util.HashSet;

public class CheckHasoverlap {

    public static boolean audienceOverlap(int blog1[], int blog2[]) {

        HashSet<Integer> visitorSet = new HashSet<>();
        HashSet<Boolean> hasOverlap = new HashSet<>();

        for (Integer id : blog1) {
            visitorSet.add(id);
            for (int j : blog2) {
                if (visitorSet.contains(j)) {
                    hasOverlap.add(true);
                }
            }
            return hasOverlap.size() > 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int blog1[] = {1, 2, 3, 4, 5};
        int blog2[] = {6, 7, 8, 9, 10};

        if (audienceOverlap(blog1, blog2))
            System.out.print("Yes, there is an audience overlap between both blogs.");
        else
            System.out.print("No, there is no audience overlap between both blogs.");
    }
}
