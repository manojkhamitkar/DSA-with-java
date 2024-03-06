package Patterns;

import java.util.*;

public class Pattern_11 {
    public static void main(String[] args) {
        // odd number sqaure pattern.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n; j++) {
                System.out.print(a + " ");
                a = a + 2;
            }
            System.out.println();
        }
    }

}
