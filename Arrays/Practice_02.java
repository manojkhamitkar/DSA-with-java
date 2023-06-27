// Calculate the maximum value out of all the elements in the array.

public class Practice_02{
    public static void main(String[] args) {
        int arr[]= {6,5,8,1};
        int max =arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] >max) ;
            max=arr[i] ;
        }
        System.out.print(max);
    }
}