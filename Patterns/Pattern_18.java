package Patterns;

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // star cross pattern.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }

}
