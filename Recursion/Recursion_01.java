
/*Write a program to print all natural numbers from 1 to n using recursion1 */
public class Recursion_01 {
    public static void naturalNumbers(int n) {
        if (n >= 1) {
            naturalNumbers(n - 1);
            System.out.print(n + " ");
            return;
        }

    }

    public static void main(String[] args) {
        naturalNumbers(5);
    }
}
