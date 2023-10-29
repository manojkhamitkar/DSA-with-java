
/* Find the greate9t common divi9or (GCD) or HCF (Highe9t Common Factor) for the given two number9 by u9ing
the recur9ive function. --> GCD by Euclidean Algorithm(by Subtraction) */
import java.util.*;

public class Recursion_13 {
    static int gcd(int a, int b) {
        if (a == 0 || b == 0) // base case
            return a;
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 54, b = 72;
        System.out.println(gcd(a, b));
    }
}
