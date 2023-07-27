/* Given an array arr[] of size n, find the first repeating element. The element should occur more than
once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
(Asuume 1 based indexing) */

import java.util.*;
public class Assignment_07 {
    static int firstRepatingElement(int n,int[] arr){
        for(int i = 0;i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            int arr[] ={10,5,3,2,5,7,5,3,2};
            int n = arr.length;
            int index = firstRepatingElement(n,arr);
            if(index == -1){
                System.out.println("NO REAPREATING ELEMENT FOUND!");
            }
            else{
                System.out.println("First repeating element is : "+arr[index]);
            }           
        }
    }
