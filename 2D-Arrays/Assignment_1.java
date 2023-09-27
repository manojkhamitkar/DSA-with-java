/* Diagonal Elements of a matrix */

import java.util.*;
public class Assignment_1 {
    public static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
    public static void diagonalMatrix(int[][] matrix , int c , int r){
        if(r==c){
            for(int i = 0 ; i < r; i++){
                for(int j = 0 ; j < c ; j++){
                    if(i==j){ 
                    System.out.print(matrix[i][j] + " ");
                  
                    }
                }
            }
            
            }
            else {
                System.out.println("Enter Equal rows and columns");
            }

        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows & columns");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];
            System.out.println("Enter "+ r*c+ " elements");
            for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println("Matrix Elements");
        printMatrix(matrix);

        System.out.println("Diagonal elements of matrix ");
        diagonalMatrix(matrix, c, r);
    }
}

