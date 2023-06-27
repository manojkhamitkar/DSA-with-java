// Calculate the sum of all the elements in the array

public class Practice_01{
    public static void main(String[] args) {
        int[] arr = {3,6,9};
        int sum =0;
        for(int i=0;i<arr.length;i++ ){ 
        sum =sum+arr[i];
    }
    System.out.print("Sum of elements is "+sum);
}
}