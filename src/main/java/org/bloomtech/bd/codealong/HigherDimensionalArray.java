package org.bloomtech.bd.codealong;

public class HigherDimensionalArray {

    public int solution(int[][][] arr, int row, int col){
        int depth = arr[row][col].length;
        int sum = 0;
        for (int k = 0; k < depth; k++) {
            sum += arr[row][col][k];
        }
        return sum;
    }
}
