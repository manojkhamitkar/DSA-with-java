package Patterns;

import java.util.*;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        // printing a sqaure pattern.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}
