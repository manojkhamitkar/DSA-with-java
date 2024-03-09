package Patterns;

import java.util.*;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // star plus pattern.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n / 2) + 1 || j == (n / 2) + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }

}
