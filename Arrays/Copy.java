// Array Copy in java.

import java.io.*;
import java.util.*;
public class Copy {
    public static void main(String[] args) {
        int a[] = {1,4,7,9,11,13,15,17,19};
        int n   = a.length;
        int b[] = Arrays.copyOf(a,6);
        b[0] = 5;
        b[3] = 10;
        System.out.println("Original Array");
        for(int i =0;i<n;i++)
        System.out.print(a[i] + " ");
        System.out.println("\nCopied Array ");
        for(int i =0;i<b.length;i++)
        System.out.print(b[i] + " ");
    }
}