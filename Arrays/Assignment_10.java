/* Given an array sorted in increasing order, return an array of squares of each number sorted in increasing
order */

import java.util.Scanner;
public class Assignment_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int idx = 0;
        int firstNonNegativeElementIndex = n;
        for(int i =0 ; i < n; i++){
            if(arr[i] >= 0){
                firstNonNegativeElementIndex =i;
                break;
            }
        }
    }
}