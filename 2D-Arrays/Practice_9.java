/* Generate a n*n matrix filled with elements from 1 to n^2 in spiral order. */

import java.util.*;
public class Practice_9 {
    static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0 , bottowRow = n-1, leftCol = 0, rightCol = n-1;
        int curr = 1;
        while(curr <= n * n){ 

        // topRow -> leftcol to rightCol
        
        for(int j = leftCol ; j <= rightCol && curr <= n*n; j++){
            matrix[topRow][j] = curr++;
        }
        topRow++;

        // rightCol -> topRow to bottomRow
        for(int i = topRow ; i <= bottowRow && curr < n*n; i++){
            matrix[i][rightCol] = curr++;
        }
        topRow++;

        // bottomRow -> rightCol to leftCol
        for(int j = rightCol ; j >= leftCol && curr < n*n; j++){
            matrix[bottowRow][j] = curr++;
        }
        topRow++;

        // leftCol -> bottomRow to topRow
        for(int i = bottowRow ; i >= topRow && curr < n*n; i++){
            matrix[i][leftCol] = curr++;
        }
        topRow++;
        
    }
    return matrix;

    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
     
      int[][] matrix = generateSpiralMatrix(n);
      printMatrix(matrix);

    }

    
}
