/*Given an integer array ‘a’ sorted in non-decreasing order, return an array of the squares of each
number sorted in non-decreasing order. */

import java.util.*;
import java.io.*;
public class Practice_15 {
    static int[] sortedSquares(int[] arr){
        int n =arr.length, i =0, j = n-1, k =0;
        int[] ans = new int[n];
        while(i <= j) {
            if(Math.abs(arr[i]) < Math.abs(arr[j])) {
                arr[j] *=  arr[j];
                ans[k++] = (arr[j--]);
            }
            else{
                arr[i] *= arr[i];
                ans[k++] = (arr[i++]);
            }
        }
        reverse(ans, 0 , ans.length-1);
        return ans;
    }
    private void reverse(int[] arr, int i,int j){
        int temp = 0;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr ={-10,-3,2,5,6};
        Practice_15 obj1 = new Practice_15();
        int[] ans =obj1.sortedSquares(arr);
        for(int element: ans) {
            System.out.print(element + " ");
        }
    }
}