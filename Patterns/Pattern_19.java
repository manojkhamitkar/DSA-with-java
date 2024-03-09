package Patterns;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // Number & Alphabet Triangle pattern.
        for (int i = 1; i <= n; i++) {
            int digits = 1;
            char c = 65;
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(c);
                    c = (char) (c + 1);
                }

                else {
                    System.out.print(digits);
                    digits++;
                }

            }
            System.out.println();
        }
    }
}

/*
 * output:
 * 
 * Enter a number: 5
 * 1
 * AB
 * 123
 * ABCD
 * 12345
 * 
 */
