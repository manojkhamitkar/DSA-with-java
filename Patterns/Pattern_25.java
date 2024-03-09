package Patterns;

import java.util.*;

public class Pattern_25 {
    public static void main(String[] args) {
        // Star Pyramid.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= a; k++) {
                System.out.print("*");

            }
            a = a + 2;
            System.out.println();
        }
    }
}
