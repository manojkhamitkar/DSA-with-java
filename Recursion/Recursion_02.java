/* Write a program to print all natural numbers from n to 1 using recursion1 */
public class Recursion_02 {
    static void reverseNataturalNumbers(int n) {
        if (n >= 1) {
            System.out.println(n + " "); // base condition.
            reverseNataturalNumbers(n - 1); // recursive function.
            return;
        }
    }

    public static void main(String[] args) {
        reverseNataturalNumbers(5);

    }

}
