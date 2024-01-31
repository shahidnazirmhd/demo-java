//2(L1).Write a Java program to add two matrices of the same size

package com.snm.demo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //Adding two matrices of the same size
        Scanner scan = new Scanner(System.in);
        System.out.println("---Enter the number of rows and columns---");
        System.out.println("Row:");
        int row = scan.nextInt();
        System.out.println("Column:");
        int col = scan.nextInt();
        System.out.println("---Enter the first matrix value---");
        int[][] firstMatrix = inputMatrix(row, col, scan);
        System.out.println("---Enter the second matrix value---");
        int[][] secondMatrix = inputMatrix(row, col, scan);

        int[][] resultMatrix = addMatrices(firstMatrix, secondMatrix);

        System.out.println("---RESULT---");
        displayResult(resultMatrix);


    }

    private static void displayResult(int[][] matrix) {
        for ( int[] row : matrix) {
            for (int element : row) {
                System.out.println(element + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int row = firstMatrix.length;
        int col = firstMatrix[0].length;
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return  result;
    }

    private static int[][] inputMatrix(int row, int col, Scanner scan) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }

}
