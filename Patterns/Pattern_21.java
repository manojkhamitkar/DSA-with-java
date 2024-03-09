package Patterns;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // 0 & 1 Triangle pattern.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");

            }
            System.out.println();
        }
    }

}
/*
 * Output:
 * Enter a number: 5
 * 1
 * 01
 * 101
 * 0101
 * 10101
 */