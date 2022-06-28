
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SAM
 */
public class NewClass {

    public static int[][] inputMatrix(int nr, int nc) {
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
        return matrix;
    }

    static void displayMatrix(int nr, int nc, int[][] matrix) {
        System.out.println("Elements of input matrix are:");
        for (int k2 = 0; k2 < nr; k2++) {
            for (int l = 0; l < nc; l++) {
                System.out.print(matrix[k2][l] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] makePivotOne(int[][] matrix, int pivotRow, int pivotColumn) {

        int nc = matrix.length;
        int pivotElement = matrix[pivotRow][pivotColumn];
        for (int i = 0; i < nc; i++) {

            matrix[pivotRow][i] = matrix[pivotRow][i] / pivotElement;
        }
        return matrix;
    }
    public static int[][] makePivotColZero(int[][] matrix, int pivotRow, int pivotColumn){
        
        int nr = matrix.length;
        int nc = matrix.length;
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
        
    return matrix;
    }
    

    public static void main(String[] args) {
        int[][] abc_matrix = NewClass.inputMatrix(2, 2);
        NewClass.displayMatrix(2, 2, abc_matrix);
        // Display matrix 			

    }
}
