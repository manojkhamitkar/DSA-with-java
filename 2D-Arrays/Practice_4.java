/*Given a 2D array for n rows and m columns, reverse each row. */

import java.util.*;
public class Practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements of 2d matrix ");
        for(int i = 0; i < r ; i++){
            for(int j =0 ; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
      for(int i = 0; i < r; i++){
        int a = 0;
        int b = c-1;
        while(a < b){
            int temp = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = temp;
            a++;
            b--;
        }
      }
      for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }

    }
}
