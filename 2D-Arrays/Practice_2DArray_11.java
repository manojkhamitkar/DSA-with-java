/* Traversing boundaries of a matrix */

import java.util.*;
public class Practice_2DArray_11 {
    static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

    }
    static void matrixBoundary(int[][] matrix, int r, int c){
        // toprow = rightcol to leftcol
        // leftcol = toprow to bottomrow
        // bottomrow = leftcol to rightcol
        // rightcol = bottomrow to toprow
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
