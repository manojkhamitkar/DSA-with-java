/* Factorial of number using recursion */
public class Recursion_03 {
    static int factorial(int n) {

        if (n == 0) {
            // System.out.println(n);
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
