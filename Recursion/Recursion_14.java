
/* Find the greate9t common divi9or (GCD) or HCF (Highe9t Common Factor) for the given two number9 by u9ing
the recur9ive function. --> Euclidean Algorithm by Division */
import java.util.*;

public class Recursion_14 {
    static int gcd(int a, int b) {
        if (b == 0) // base case
            return a;
        return gcd(b, a % b); // recursive work

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

}
