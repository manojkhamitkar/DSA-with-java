/*Find the second-larget value in the given array. */

import java.util.*;
import java.lang.*;
public class Practice_09 {
    public static int secondLargestValue(int[] arr){
        int n= a.length;
        int max =Interger.MIN_VALUE;
        int smax=Interger.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<a[i])
            max=a[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]!=max)
            {
                if(a[i]>smax)
                smax=a[i];
            }
        }
        return smax;

    }
    public static void main(String[] args) {
        int a[]={21,7,3,21,5,7,5};
        System.out.println(secondLargestValue(a));
    }
}