package org.example.binarySearch;

public class FixFindBook {

    static int findBook(String[] books, int start, int end, String target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (target.compareTo(books[mid]) == 0) return mid;
        if (target.compareTo(books[mid]) < 0)
            return findBook(books, start, mid - 1, target);
        return findBook(books, mid + 1, end, target);
    }

    public static void main(String[] args) {
        String[] library = {"Alice in Wonderland", "Moby Dick", "The Great Gatsby", "War and Peace"};
        String bookToFind = "The Great Gatsby"; // Book we want to find
        int result = findBook(library, 0, library.length - 1, bookToFind);
        System.out.println("The book '" + bookToFind + "' is at index: " + result);
    }
}
