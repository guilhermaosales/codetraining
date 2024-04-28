package org.example.iterations;

import java.util.Arrays;

public class ArrayTabular {

    public static void main(String[] args) {
        arrayTabular(new int[]{4, 35, 80, 123}, 4);

    }

    public static void arrayTabular(int[] A, int K) {
        int rows = K;
        int columns = A.length / K;
        int newDimensionalArray[][] = new int[columns][rows];

        int i, j = 1;
        int index = 0;
        for(i = 0; i < columns; i++) {
            for(j = 0; j < rows; j++) {
                newDimensionalArray[i][j] = A[index];
                index++;
            }
        }

        for(int[] row : newDimensionalArray) {
            printRow(row);
        }

    }

    public static void printRow(int[] row) {
        int majorNumber = Arrays.stream(row).max().getAsInt();
        int widthCell = String.valueOf(majorNumber).length();
        String trace;

        StringBuilder sb = new StringBuilder("+");
        for (int i = 0; i <= widthCell; i++) {
            sb.append("-");
        }
        sb.append("+");
        trace = sb.toString();

        System.out.println(trace);
        for (int i : row) {
            System.out.print("|");
            echoBackspace(i, widthCell);
            System.out.print(i);
        }
        System.out.println();
    }



    public static void echoBackspace(int number, int widthSize) {
        StringBuilder sb = new StringBuilder();
        int backspace = widthSize - String.valueOf(number).length();
        for (int i = 0; i < backspace; i++) {
            sb.append(" ");
            System.out.print(sb.toString());
        }

    }
}


