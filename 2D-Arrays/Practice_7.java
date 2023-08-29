// Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.

import java.util.Scanner;
public class Practice_7 {
    public static void printArray(int[][] arr) {
        for(int i = 0; i < arr[i].length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int arr[][], int n){
        /* apporch - 1 */
        // for (int i = 0; i < n/2; i++){
        //     for(int j = i; j < n-i-1; j++){
        //         int temp = arr[i][j];
        //         arr[i][j] = arr[n-1-j][i];
        //         arr[n-1-i][i] = arr[n-1-i][n-1-j];
        //         arr[n-1-j][n-1-j] = arr[j][n-1-i];
        //         arr[j][n-1-i] = temp;
        //     }
        // }
        /* apporch - 2 */
        for(int j = 0; j < n; j++){
            for( int i = n-1; i >= 0; i--){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        System.out.println("Enter "+n*m+" elements");
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        rotate(arr1, n);
        
    }
    
}

