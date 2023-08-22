/*Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix
should also be sorted. */

import java.util.Scanner;
public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of 2d array : ");
        System.out.println("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns ");
        int c = sc.nextInt();
        int arr[] = new int[r*c];
        int[][] arr1= new int[r][c];
        System.out.println("Enter 1D-Array elements ");
        for(int i =0 ; i < r*c; i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0;j<c;j++){
            arr1[i][j] = arr[idx];
            idx++;
        }
    }
        for(int i = 0; i <r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr1[i][j] + " ");

            }
        
        System.out.println();
        }
    }
    
}
