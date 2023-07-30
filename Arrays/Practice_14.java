/* Given an array of integers ‘a’, move all the even integers at the beginning of the array followed by
all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies
the condition. */

import java.io.*;
import java.util.*;
public class Practice_14 {
    public static int[] sortArrayByParity(int[] arr) {
        int i=0 ,j=arr.length-1;
        while(i < j){
            if(arr[i] % 2 == 1 && arr[j] % 2 == 0){
                // swapping the values of a[i] and a[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i] % 2 == 0) i++;
            if(arr[j] % 2 == 1) j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = sortArrayByParity(arr);
        System.out.println("After sorting ");
        for (int element : ans){
            System.out.print(element + " ");
        }
    }
}