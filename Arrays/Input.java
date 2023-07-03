// Taking input in an array.

import java.io.*;
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter array elements: ");
        for(int i =0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println("\nArray element are: ");
        for(int i =0;i<n;i++){ 
        System.out.println(arr[i]);
     }
  }
}