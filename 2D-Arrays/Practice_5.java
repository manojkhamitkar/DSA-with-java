/*Check if an element x exists in the given sorted matrix or not. Each row and column is sorted in itself. If it
does not exist, return -1, else return its row and column index. */

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
    }
}
