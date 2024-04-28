package org.example.binarySearch;

public class FindBook {

    static int findBook(int[] catalog, int left, int right, int bookCode) {

        if (left > right) return -1;

        int mid = left + (right - left) / 2;
        if (catalog[mid] == bookCode) return mid;
        if (catalog[mid] < bookCode)
            return findBook(catalog, mid + 1, right, bookCode);
        return findBook(catalog, left, mid - 1, bookCode);

    }

    public static void main(String[] args) {
        int[] sortedCatalog = {101, 123, 137, 150, 165, 172, 189, 205, 220};
        int bookCode = 150;
        System.out.println("Book found at index: " + findBook(sortedCatalog, 0, sortedCatalog.length -1, bookCode));
    }
}
