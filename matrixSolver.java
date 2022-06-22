package com.mycompany.guiproject;

import java.util.Scanner;

public class matrixSolver {

    public static void main(String[] args) {
        // Array input

        int nr, nc, pivotRow, pivotColumn, pivotValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        nr = input.nextInt();
        System.out.print("Enter num of cols: ");
        nc = input.nextInt();
        int[][] matrix = new int[nr][nc];
        System.out.println("Enter matrix elements: ");
        for (int k = 0; k < nr; k++) {
            for (int k2 = 0; k2 < nc; k2++) {
                matrix[k][k2] = input.nextInt();
            }
        }
        // Display matrix 			

        System.out.println("Elements of input matrix are:");
        for (int k2 = 0; k2 < nr; k2++) {
            for (int l = 0; l < nc; l++) {
                System.out.print(matrix[k2][l] + " ");
            }
            System.out.println();
        }
        // input pivot row and col
        Scanner inputPivot = new Scanner(System.in);
        System.out.println("Enter pivot row number: ");

        pivotRow = inputPivot.nextInt();
        System.out.println("Enter pivot column number: ");
        pivotColumn = inputPivot.nextInt();
        pivotRow -= 1;
        pivotColumn -= 1;
        
       

        while (pivotRow >= 0 && pivotColumn >= 0) {
            int pivotElement = matrix[pivotRow][pivotColumn];
            for (int i = 0; i < nc; i++) {

                matrix[pivotRow][i] = matrix[pivotRow][i] / pivotElement;
            }
            for (int r = 0; r < nr; r++) {
                if (r == pivotRow) {
                    continue;
                }
                if (r != pivotRow) {
                     pivotValue = matrix[r][pivotColumn];
                }
                for (int i = 0; i < nc; i++) {
                    matrix[r][i] = matrix[r][i] - matrix[pivotRow][i] * pivotValue;
                }
                   // Display matrix 			

        System.out.println("Elements of input matrix are:");
        for (int k2 = 0; k2 < nr; k2++) {
            for (int l = 0; l < nc; l++) {
                System.out.print(matrix[k2][l] + " ");
            }
            System.out.println();
        }

            }
            System.out.println("Enter pivot row number: ");
            pivotRow = inputPivot.nextInt();
            System.out.println("Enter pivot column number: ");
            pivotColumn = inputPivot.nextInt();
            pivotRow -= 1;
            pivotColumn -= 1;

        }

    }
}
