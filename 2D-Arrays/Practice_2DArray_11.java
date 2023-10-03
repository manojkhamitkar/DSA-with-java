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
        int toprow = 0 , bottomrow = r-1, leftcol = 0, rightcol = c-1; 
        // toprow = leftcol to rightcol
        for(int j = leftcol; j < rightcol; j++ ){
           System.out.println( matrix[toprow][j]);
        }
        // leftcol = toprow to bottomrow
        for(int i = toprow; i < bottomrow; i++ ){
             System.out.println( matrix[i][leftcol]);
        }
        // bottomrow = leftcol to rightcol
        for(int j = leftcol; j < rightcol; j-- ){
             System.out.println( matrix[bottomrow][j]);
        }
        // rightcol = bottomrow to toprow
        for(int i= bottomrow; i < toprow; i-- ){
             System.out.println( matrix[i][rightcol]);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c= sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter "+r*c +" elements");
        for(int i = 0 ; i < r; i ++){
            for(int j = 0 ; j < c; j ++){
                matrix[i][j] = sc.nextInt();
            }
        }
        matrixBoundary(matrix, r, c);
        printMatrix(matrix);
    }
}
