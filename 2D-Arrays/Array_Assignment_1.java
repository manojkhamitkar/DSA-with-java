/* Given an integer n, return the first n rows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above . */

import java.util.*;
public class Array_Assignment_1 {
        public static int[][] pascal(int n){
            int[][] ans = new int[n][];
            int col = 1;
            for(int i =0; i < n; i++){
                ans[i] = new int[col];
                for(int j =0; j < col; j++){
                if(j==0){
                    ans[i][j]=1;
                }
                else if(j==col-1){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j] = ans[i-1][j-1]+ans[i-1][j];
                }
            }
            col++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("pascal triangle");
        int[][] ans = pascal(n);
        for(int i =0 ; i < n; i++){
            for(int j = 0; j < ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
