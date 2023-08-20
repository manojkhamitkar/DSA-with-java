// Matrix Addition uisng 2D-Arrays.

import java.util.Scanner;

public class Practice_001 {

public static void printMatrix(int[][] matrix){ 
for (int i = 0; i < matrix.length ; i++){  //row
    for (int j = 0; j < matrix[i].length; j++){ // column
         System.out.print(matrix[i][j] + " ");
    }
        System.out.println();
    }
}
public static void matrixAdd(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
   if(r1 != r2 && c1 != c2){
    System.out.print("Wrong Input - Addition not possible");
    return ;
   } 
   int[][] sum = new int[r1][c1];

   for (int i = 0; i < r1; i++){
    for (int j = 0; j< c1; j++){
        sum[i][j] = a[i][j]+b[i][j];
    }
   }
  printMatrix(sum);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows of matrix-1 : ");
    int r1 = sc.nextInt();
    System.out.println("Enter nubmer of columns of matrix-1");
    int c1 = sc.nextInt();
    int[][] a = new int[r1][c1];
    System.out.println("Enter values of matrix-1 ");
    for(int i = 0; i < r1; i++){
        for(int j =0; j < c1; j++){
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("Enter number of rows of matrix-2");
    int r2 = sc.nextInt();
    System.out.println("Enter number of columns of matrix-2");
    int c2 = sc.nextInt();
    int[][] b = new int[r2][c2];
    System.out.println("Enter values of matrix-2");
    for(int i = 0; i < r2; i++ ){
        for(int j = 0; j< c2; j++){
            b[i][j] = sc.nextInt();
        }
    }
    System.out.println("Matrix 1");
    printMatrix(a);
    System.out.println("Matrix 2");
    printMatrix(b);
    System.out.println("Addition of two matrix ");
    matrixAdd(a, r1, c1, b, r2, c2);
}
    
}


