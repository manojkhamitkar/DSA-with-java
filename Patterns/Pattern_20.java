package Patterns;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // Floyd’s Triangle pattern.
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = a + 1;

            }
            System.out.println();
        }
    }
}
