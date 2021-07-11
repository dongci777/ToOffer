package com.dongci777;

/**
 * @Author: zxb
 * @Date : 2021/7/11 9:08 下午
 */

/**
 * 时间复杂度：O（M+N）
 * 空间复杂度：O（1）
 */
public class TwoDimensionalArrayLookup {
    public static boolean find(int target, int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("The two-dimensional array is empty...");
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;
        int row = 0, col = cols - 1;
        while (row < rows && col >= 0) {
            if (target == matrix[row][col]) {
                System.out.println("target is in the two-dimensional array,location is (" + row + "," + col + ")");
                return true;
            } else if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("sorry,target is not in the two-dimensional array");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        find(7, matrix);
    }
}
