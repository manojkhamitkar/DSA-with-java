/* Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
integer) */

import java.util.*;
import java.util.Arrays;
public class Assignment_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // Store the n integers in an array
        System.out.print("Enter array elements : ");
        for(int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
Arrays.sort(arr); // on osrting , same integers will get aligned in consecutive indices
int i = 0;
int count = 0;
while(i < n){
    count++;
    while(i < n-1 && arr[i+1] == arr[i]){ // skip duplicates of elemnets
        i++;
    }
    i++; // increments 1 more as i was still pointing to the last duplicate of previous element
}
if(count >= m){
    System.out.print(true);
}else{
    System.out.print(false);
    }
  }
}
