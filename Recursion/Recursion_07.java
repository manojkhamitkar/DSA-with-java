import java.util.*;

public class Recursion_07 {
    static int power(int a, int b) {

        // Base case
        if (b == 0)
            return 1;

        // Recursive case
        int power = a * power(a, b - 1);
        return power;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }
}
