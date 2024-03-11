package Patterns;

import java.util.*;

public class Pattern_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of lines: ");
        int n = scanner.nextInt();
        /*
         * @
         * 
         * @ @
         * 
         * @ @ @
         * 
         * @ @ @ @
         */
        int a = 1;
        int b = n / 2 + 1;
        // int space = 1;
        for (int i = 1; i <= n; i++) { // rows
            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");
            for (int j = 0; j < a; j++) { // column
                if (i <= b) {
                    System.out.print("*");
                    a = a + 2;

                } else {
                    System.out.print("*");

                }
                a = a - 2;

            }
            a = a + 2;
            System.out.println();
        }
    }

}
