// Given an unsoeted array arr[] of size N having both negative and positive integers,
// place all negative elements at the end of array without changing the order of positive 
// elements and negative elements.

import java.util.*;
public void main change(int a[],int x){
    for (int i =0;i<a.length;i++){
        if(a[i] > a[i-1])
        a[i]=a[i-1];

    }
}
 public class Assignment_06 {
    public static void main(String[] args) {
        int a[] = {1,-1,3,2,-7,-5,11,6};
        System.out.print(change(a[i]));
    }

 }