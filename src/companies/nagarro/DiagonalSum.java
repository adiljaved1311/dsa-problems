package companies.serviceNow;

import java.util.List;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {9,8,9}
                      };
        System.out.println(diagonalsAbsoluteDifference(arr));
    }
    public static int diagonalsAbsoluteDifference(int arr[][]){
        int n = arr.length;
        // Initialize sums of diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += arr[i][i];
            d2 += arr[i][n-i-1];
        }
        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }
    public static int diagonalsAbsoluteDifference2(List<List<Integer>> arr){ // o(n)
        int n = arr.size();
        // Initialize sums of diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += arr.get(i).get(i);
            d2 += arr.get(i).get(n-i-1);
        }
        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }
    public static int diagonalsAbsoluteDifference1(int arr[][]){ // O(n^2)
        int diff = 0;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(i == j){
                    leftDiagonalSum += arr[i][j];
                }if (i == (arr.length - j - 1)){
                    rightDiagonalSum = rightDiagonalSum + arr[i][j];
                }
            }
        }
        return Math.abs(leftDiagonalSum-rightDiagonalSum);
    }
}
