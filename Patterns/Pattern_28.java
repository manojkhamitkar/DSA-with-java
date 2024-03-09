package Patterns;

import java.util.*;

public class Pattern_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Diamond Pattern.
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int nsp = 1;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - nsp; k++) {
                System.out.print(" ");
            }
            nsp++;

            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            a = a + 2;
            System.out.println();
        }

    }

}
