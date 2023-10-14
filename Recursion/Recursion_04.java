import java.util.*;

public class Recursion_04 {
    static int fabonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fabonacci(n - 1) + fabonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        System.out.println(n + "th Fabonacci number of  " + fabonacci(5));
    }
}
