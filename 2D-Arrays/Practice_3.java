/*Given a 2D array of n rows and m columns, return the sum of elements along the range of row and
column specified. */
import java.util.*;
public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dimensions of the 2d array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the range of rows: ");
        int srow = sc.nextInt(); // starting row
        int erow = sc.nextInt(); // ending row
        System.out.println("enter the range of columns : ");
        int scol = sc.nextInt();
        int ecol  =sc.nextInt();
        int sum = 0;
        while(srow <= erow){
            int j = scol;
            while( j <= ecol){
                sum  = sum + mat[srow][j];
                j++;
            }
            srow++;
        }
        System.out.println(sum);


        }
    }
    

