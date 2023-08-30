/* Given two integer matrices, multiply the matrices, if possible, else return “Invalid Input”. */

import java.util.*;
public class Assignment_2 {
    static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j =0 ;j < arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void multiply(int[][] arr1,int n1,int m1,int[][] arr2,int n2, int m2){
        if(m1!=n2){
        System.out.println("Not possible ");
        System.out.println("-1");
        }
        int[][] mat = new int[n1][m2];
        for(int i = 0; i < n1; i++){
            for(int j =0 ;j < m2;j++){
                for(int k = 0 ; k < n1 ;k++){ 
                 mat[i][j] += (arr1[i][k] * arr2[k][j]);
               }
        }  
    }
    System.out.println("Matrix multiplication");
    printArray(mat);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix -1");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] arr1 = new int[n1][m1];
        System.out.println("Enter "+ n1*m1 + " elements");
         for(int i = 0; i < n1; i++){
            for(int j =0 ;j < m1;j++){
               arr1[i][j] = sc.nextInt();
            }
        }
         System.out.println("Enter number of rows and columns of matrix -2");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] arr2 = new int[n2][m2];
        System.out.println("Enter "+ n2*m2 + " elements");
         for(int i = 0; i < n2; i++){
            for(int j =0 ;j < m2;j++){
               arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix-1");
        printArray(arr1);
        System.out.println("Matrix-2");
        printArray(arr2);
        multiply(arr1, n1, m1, arr2, n2, m2);
       
}
}

    

