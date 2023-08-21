/* Check if an element x exists in the given matrix or not. If it does not exist, return -1, else return its
row and column index.*/

import java.util.Scanner;
public class Practice_1 
{
    public static void printArray(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j =0; j <arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
         System.out.println();  
        }
    }
       public static void existOfNumber(int[][] arr, int r, int c,int x) {
        for(int i =0;i < r; i++){
            for(int j =0; j< c; j++){
                if(arr[i][j] == x){
                    System.out.println("row "+i);
                    System.out.println("Column "+j);
            }
            else {
        }
    }
    
        

    }   
    System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter elements of matrix ");
         for(int i=0; i < r; i++){
            for(int j =0; j <c;j++){
                arr[i][j] = sc.nextInt();
            }
           
        }
        printArray(arr);
        System.out.print("Enter any number : ");
        int x = sc.nextInt();
        existOfNumber(arr, r, c, x);
        }

    }
    

