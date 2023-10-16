
/* Given an integer, find out the sum of its digits using recursion. */
import java.util.*;

public class Recursion_05 {

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n + (n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }

}
