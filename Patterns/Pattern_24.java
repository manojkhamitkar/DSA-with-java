package Patterns;

import java.util.*;

public class Pattern_24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // Parallelogram pattern.
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
