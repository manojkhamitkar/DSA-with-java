/* Check if we partition the array into two subarrays with equal sum.
 * More formally,check thst the prefix sum of a part of the array
 * is equal to the prefix sum of a part of the array is equal to the 
 * suffix sum of the array.
 */
public class Practice_17 {
     static int partitionsPossible(int arr[], int n, int k) {
        int sum = 0;
        int count = 0;

        // calculate the sum of the array
        for(int i = 0; i < n; i++){
            sum +=arr[i];
        }
        if (sum % k != 0) {
            return 0;
        }
        sum = sum / k;
        int ksum = 0;

        // ksum denotes the sum of each subarray
        for (int i =0 ; i < n; i++){
            ksum = ksum +arr[i];

            // one subarray is found
            if (ksum == sum ) {
                // to locate another
                ksum = 0;
                count++;
            }
        }
        if (count == k) {
            return 1;
        }else {
            return 0;
        }
     }
     public static void main(String[] args) {
        int arr[] = {1,1,2,2};
        int k = 2;
        int n = arr.length;

        if(partitionsPossible(arr, n, k)==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
     }
    }
       
