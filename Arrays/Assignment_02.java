//  Calculate the minimum element in the array {2,-3,5,8,1,0,-4}.

 public class Assignment_02 {
    public static void main(String[] args) {
        int[] arr = {2,-3,5,8,1,0,-4};

        //Asume the first element as the minimum
        int min =arr[0];
        for(int i =1;i < arr.length;i++){
            if(arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println("Minimum element:" + min);
    }
 }