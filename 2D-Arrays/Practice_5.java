/*Check if an element x exists in the given sorted matrix or not. Each row and column is sorted in itself. If it
does not exist, r
eturn -1, else return its row and column index. */

import java.util.*;
public class Practice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter "+r*c+" elements");
        for(int i = 0; i < r; i++){
            for(int j =0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element to check ");
        int x = sc.nextInt();
        int i = 0, j = c-1;
        
        while (i < r && j>=0){ 
        if(arr[i][j]==x){
        System.out.println(i);
        System.out.println(j);
        return;
        
        
    
                }if(arr[i][j] > x)
                j--;
                else
                i++;
            }
                System.out.println(-1);
    }
}
