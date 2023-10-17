
/* Given an integer, find out the sum of its digits using recursion. */
import java.util.*;

public class Recursion_06 {
    static int sumOfDigits(int n) {
        // BASE CASE
        if (n == 0)
            return 0;

        // RECURSIVE WORK
        return (n % 10 + sumOfDigits(n / 10));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }

}
