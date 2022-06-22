/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrixsolver;
import java.util.Scanner;
/**
 *
 * @author SAM
 */
public class MatrixSolver {

    public static void main(String[] args) {
        // Array input

        int nr, nc;
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
    }
}
