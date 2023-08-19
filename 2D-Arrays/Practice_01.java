// Matrix Addition uisng 2D-Arrays.

import java.util.Scanner;

public class Practice_01 {

public static void matrix(int[][] matrix){ 
for (int i = 0; i < matrix.length ; i++){
    for (int j = 0; j < matrix[i].length; j++){
         System.out.print(matrix[i][j] + " ");
    }
        System.out.println();
    }
}
static void matrixAdd(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
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
   matrix(a);
   System.out.print("Addition of two matixes is : "+sum[i][j]);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int r2 = sc.nextInt();

}
    
}
