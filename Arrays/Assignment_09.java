// Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum.

import java.util.Scanner;
public class Assignment_09 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array : ");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int odd = 0, even = 0, sum = 0;
    for (int num : arr) {
        if (num % 2 == 1) {
            int temp = odd ;
            odd = even;
            even = temp;
            odd++;
        }
        else{
            even++;
        }
        sum += odd;
    }
    System.out.println(sum);
}
}
