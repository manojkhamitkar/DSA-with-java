// Given an unsoeted array arr[] of size N having both negative and positive integers,
// place all negative elements at the end of array without changing the order of positive 
// elements and negative elements.

import java.util.*;
public class Assignment_06 { 
 public  static void reArrange(int[] arr) {
    int left = 0;
    int right = arr.length -1;
    
    while (left <= right) {
        if (arr[left]>= 0){
            left++;
        }
        else if(arr[right]< 0){
            right--;
        }else{ 
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
   public static void main(String[] args) {
    int[] arr = {1,-2,3,-4,5,-6,7,-8};
    reArrange(arr);

   }
}    
   