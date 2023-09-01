/* Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz
if every diagonal from top-left to bottom-right has the same elements. */

import java.util.*;
public class Assignment_3 {
    static void printArray(int[][] arr){
      for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
                }
                System.out.println();
            }  
    }
    static boolean isToeplitz(int[][] arr, int n ,int m){
        for(int i = 1 ; i < n ; i++){
            for(int j = 1; j < m ; j++){
                if ( arr[i][j] != arr[i-1][j-1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns ");
        int n = sc.nextInt();
        int m  = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter "+ n*m + " elements");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        if(isToeplitz(arr, n, m))
        System.out.println("Matrix is a toeplitz");
        else
        System.out.println("Matrix is not a Toeplitz");
       
    }
    
}
