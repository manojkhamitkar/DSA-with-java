/* Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix. */

import java.util.*;
public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3 , m = 3;
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int[] arr = new int[n*m]; 
        int idx = 0;
        int row =  0;
        int col = 0;
        while(col < m){
            int i = row;
            int j = col;
            while (i >= 0 && j < m){
                arr[idx] = mat[i][j];
                i--;
                j++;
            }
            row++;
            if(row >= n){
                row = n-1;
                col++;
            }
        }
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
           }
    }
    

