package Patterns;

public class Pattern_06 {
    public static void main(String[] args) {
        int n = 5;
        // reverse numbers right angle triangle pattern.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
