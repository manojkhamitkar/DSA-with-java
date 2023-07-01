// Find the first peak element in the array {2,-3,5,8,1,0,-4} 
public class Assignment_05 {
    public static void main(String[] args) {
        int[] arr ={2,-3,5,8,1,0,-4};
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}