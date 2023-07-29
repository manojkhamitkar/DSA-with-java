// Sort an Array consisting of only 0s and 1s.

import java.io.*;
import java.util.*;
public class Practice_13 {
    public static void sortZerosAndOne(int[] a) {
        int n = a.length;
        int i = 0;
        int j = n-1;
        while (i < j) {
            if(a[i] == 1 && a[j] == 0) {
                a[i] = 0;
                a[j] = 1;
                i++;
                j--;
            }
            if (a[i] == 0) i++;
            if (a[j] == 1) j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter "+n+" Elements : ");
        for(int i = 0; i < n; i++){
            a[i]= sc.nextInt();
        }
        sortZerosAndOne(a);
        for (int element: a){
            System.out.print(element + " ");
        }

    }
}