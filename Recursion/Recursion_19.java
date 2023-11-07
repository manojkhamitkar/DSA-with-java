
/*Find the sum of the elements of the array.  */

public class Recursion_19 {
    static int sumOfArray(int[] arr, int idx) {
        if (idx == arr.length) // Base Case
            return 0;

        int smallAns = sumOfArray(arr, idx + 1); // Recursive work
        return smallAns + arr[idx]; // Self work
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(sumOfArray(arr, 0));

    }
}
