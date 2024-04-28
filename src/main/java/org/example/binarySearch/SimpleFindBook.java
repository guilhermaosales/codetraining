package org.example.binarySearch;

public class SimpleFindBook {

    static int findBook(int[] catalog, int bookCode) {
        int left = 0;
        int right = catalog.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (catalog[mid] == bookCode) return mid;
            if (catalog[mid] < bookCode) left = mid + 1;
            else right = mid - 1;
        }

        return -1; // Book not found
    }

    public static void main(String[] args) {
        int[] sortedCatalog = {101, 123, 137, 150, 165, 172, 189, 205, 220};
        int bookCode = 150;
        System.out.println("Book found at index: " + findBook(sortedCatalog, bookCode));
    }
}
