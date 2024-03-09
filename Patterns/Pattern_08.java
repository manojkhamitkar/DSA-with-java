package Patterns;

import java.util.*;

public class Pattern_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // To Print reverse triagle pattern.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

}
