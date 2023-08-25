// Write a programto Print the transpose of the matrix entered by the user.

import java.util.Scanner;
public class Practice_6 {
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
