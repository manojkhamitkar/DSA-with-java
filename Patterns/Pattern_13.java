package Patterns;

import java.util.*;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // Reverse number triangle pattern.
        for (int i = 0; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a + " ");
                a = a + 2;
            }
            System.out.println();
        }
    }

}
