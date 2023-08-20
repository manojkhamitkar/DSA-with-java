// matrix multiplication using 2D-Array.

import java.util.*;
public class MatrixMultiplication {
static void printMatrix(int[][] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j =0; j < arr[i].length; j++ ){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

static void multiplication(int[][] a, int r1 , int c1 , int[][] b, int r2, int c2){
    if(c1 != r2 ){
        System.out.println("multiplication not possible - wrong dimensions.");
        return ;
    }
    int[][] mul = new int[r1][c2];
    for(int i = 0; i < r1; i++){
        for(int j = 0; j < c2; j++){
            for(int k = 0; k < c1; k++){
               mul[i][j] += (a[i][k] * b[k][j]);
            }
        }
    }
    System.out.println("Multiplication of 2 matrixes ");
    printMatrix(mul);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter elements of matrix-1");
        for(int i = 0; i < r1; i++){
            for(int j =0; j < c1; j++ ){
        a[i][j] = sc.nextInt();

        }
    }
        System.out.println("Enter number of rows : ");
        int r2= sc.nextInt();
        System.out.println("Enter number of columns : ");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter elements of matrix-2");
        for(int i = 0; i < r2; i++){
            for(int j =0; j < c2; j++ ){
        b[i][j] = sc.nextInt();

        }
    }
    System.out.println("Matrix-1 ");
    printMatrix(a);
    System.out.println("Matrix-2");
    printMatrix(b);
    multiplication(a, r1, c1, b, r2, c2);
    
    }
    
   
}
