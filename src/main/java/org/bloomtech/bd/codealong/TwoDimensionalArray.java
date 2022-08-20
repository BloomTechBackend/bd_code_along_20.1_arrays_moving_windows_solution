package org.bloomtech.bd.codealong;

public class TwoDimensionalArray {

    public int[][] solution(int size) {
        int[][] arr = new int[size][size];
        for (int row = 0 ; row < size; row++) {
            for (int col = 0; col < size; col++) {
                arr[row][col] = 0;
            }
            arr[row][row] = 1;
        }
        return arr;
    }
}
