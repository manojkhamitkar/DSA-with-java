// Given an array of size U containing only 0s, 1s, and 2s; sort the array in ascending order.
package Sorting_Algorithm.Practice;

import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = scn.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        sortArr(num, n);
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void sortArr(int[] num, int n) {
        int i = 0;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        // Count the number of 0s, 1s and 2s in the array
        for (i = 0; i < n; i++) {
            switch (num[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }

        // Update the array
        i = 0;

        // Store all the 0s in the beginning
        while (count0 > 0) {
            num[i++] = 0;
            count0--;
        }

        // Then all the 1s
        while (count1 > 0) {
            num[i++] = 1;
            count1--;
        }

        // Finally all the 2s
        while (count2 > 0) {
            num[i++] = 2;
            count2--;
        }
    }

}
