
/* Given a number n, check whether it's a prime number or not using recursion. */
import java.util.*;

public class Recursion_17 {
    static Boolean primeOrNot(int a, int i) {
        if (a <= 2) // Base case
            return (a == 2) ? true : false;
        if (a % 2 == 0) // base case
            return false;
        if (i * i > a) // self work
            return true;
        // Check for next divisor
        return primeOrNot(a, i + 1); // recursive work

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (primeOrNot(a, 2))
            System.out.println("Yes");
        else
            System.out.println("NO");

    }
}
