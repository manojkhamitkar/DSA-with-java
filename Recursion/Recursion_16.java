
/* Given two number a and b find product using recursion. */
import java.util.*;

public class Recursion_16 {
    static int product(int a, int b) {
        if (a < b)
            return product(b, a);
        else if (b != 0)
            return a + product(a, b - 1);
        else
            return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a, b));
    }
}
