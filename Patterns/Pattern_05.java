package Patterns;

public class Pattern_05 {
    public static void main(String[] args) {
        // number right angle triangle pattern.
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
