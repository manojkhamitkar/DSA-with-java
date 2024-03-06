package Patterns;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // Alphabet triangle pattern.
        for (int i = 1; i <= n; i++) {
            char c = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c = (char) (c + 1);
            }
            System.out.println();
        }

    }
}
