// Returning spiral order elements from the matrix .
import java.util.*;
public class Practice_8 {
    static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix , int r , int c){
        int topRow= 0 , bottowRow = r-1, leftCol = 0 , rightCol = c-1;
        int totalelement = 0;
        
        while(totalelement < r * c){

            // toprow -> leftCol to rightCol
            for(int j = leftCol ; j <= rightCol && totalelement < r*c; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalelement++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i = topRow; i <= bottowRow && totalelement < r*c; i ++){
                System.out.print(matrix[i][rightCol] + " ");
                totalelement++;
            }
            rightCol--;

            //bottomrow -> rightCol to leftCol
            for(int j = rightCol ; j >= leftCol && totalelement < r*c; j --){
                System.out.print(matrix[bottowRow][j] + " ");
                totalelement++;
            }
            bottowRow--;

            // leftCol -> bottomCol to topCol
            for(int i = bottowRow; i >= topRow && totalelement < r*c ; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalelement++;
            }
            leftCol++;
        }

       System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows & columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelement = r * c;
        System.out.println("Enter "+totalelement+" elements");
        for(int i = 0 ; i < r; i ++){
            for(int j = 0 ; j < c; j ++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Spiral Matrix");
        printSpiralOrder(matrix, r, c);
        System.out.println();
    }
    
}
