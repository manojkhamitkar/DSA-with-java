// Given an array of integers {2,6,-5,-1,0,4,-9},print on;y the positive values present in the array.
public class Assignment_01 {
    public static void main(String[] args) {
        int arr[] = {2,6,-5,-1,0,4,-9}; 
        for(int val : arr){
            if(val >= 0){
                System.out.println(val);
            }
        }
    }
}