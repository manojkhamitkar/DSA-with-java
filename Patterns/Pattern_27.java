package Patterns;

import java.util.Scanner;

public class Pattern_27 {
    public static void main(String[] args) {
        // Alphabetic Pyramid.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 65;
            for (int k = 1; k <= a; k++) {
                System.out.print(ch);
                ch = (char) (ch + 1);

            }
            a = a + 2;
            System.out.println();
        }
    }
}
