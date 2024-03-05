package Patterns;

public class Pattern_08 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

}
