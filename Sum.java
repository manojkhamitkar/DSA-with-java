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
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        int target =sc.nextInt();
        System.out.println(pairSum(arr,target));
    }
}