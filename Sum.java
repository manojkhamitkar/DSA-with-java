// Find the total number of pairs in the array whose sum is equal to the given value x.

import java.util.*;
import java.lang.*;
public class Sum {
    public static int pairSum(int a[],int x) {
        int count = 0;
        int n = a.length;
        for(int i=0;i<n;i++)
        for(int j=i+1;j<n;j++)
        if(a[i]+a[j]==x)
        count++;
        return count;
    }
    public static void main(String[] args){
        int a[]={4,7,3,21,6,5,5};
        System.out.println(pairSum(a,10));
    }
}