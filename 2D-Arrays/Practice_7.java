// Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.

import java.util.Scanner;
public class Practice_7 {
    static void printArray(int[][] arr) {
        for(int i = 0; i < arr[i].length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int arr[][], int N){
        for (int i = 0; i < N/2; i++){
            for(int j = i; j < N-i-1; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[N-1-j][i];
                arr[N-1-i][i] = arr[N-1-i][N-1-j];
                arr[N-1-j][N-1-j] = arr[j][N-1-i];
                arr[j][N-1-i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter "+n*m+" elements");
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        rotate(arr, n);
    }
    
}

