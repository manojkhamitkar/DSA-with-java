/*Given an array of positive and negative numbers, arrange them in an alternate fashion such that
every positive number is followed by a negative and vice-versa maintaining the order of appearance.
The number of positive and negative numbers need not be equal. Begin with a negative number.
If there are more positive numbers, they appear at the end of the array. If there are more negative
numbers, they too appear at the end of the array. */

import java.util.*;
public class RearrangeArray {
    void rightrotate(int arr[],int n ,int outofplace,int cur){
        int temp=arr[cur];
        for (int i = cur; i > outofplace; i--)
        arr[i] = arr[i - 1];
        arr[outofplace] = temp;
    }
    void rearrange(int arr[], int n)
    {
        int outofplace = -1;
        for (int index = 0; index < n; index++){
            if (outofplace >= 0){
                if (((arr[index] >= 0)
                && (arr[outofplace] < 0))
                || ((arr[index] < 0)
                && (arr[outofplace] >= 0))) {
                    rightrotate(arr, n, outofplace, index);

                    if(index - outofplace >= 2)
                        outofplace = outofplace + 2;
                    else
                        outofplace = -1;
                }
            }
            if (outofplace == -1){
                if (((arr[index] >= 0)
                    && ((index & 0x01) == 0))
                    || ((arr[index] < 0)
                    && (index & 0x01) == 1))
                outofplace = index;
            }
        }
    }
    void printArray(int arr[],int n)
    {
        for (int i = 0; i< n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args)
    {
        RearrangeArray rearrange = new RearrangeArray();
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n = arr.length;

        System.out.println("Given array is ");
        rearrange.printArray(arr, n);

        rearrange.rearrange(arr, n);
        
        System.out.println("Reaarange array is ");
        rearrange.printArray(arr, n);
    }
}