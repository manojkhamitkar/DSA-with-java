
/* Given a number n . find the sum of natural numbers till n but with alternate signs 
 *  That means if n == 5 then you have to return 1-2+3-4+5 = 3 as your answer.
 * Constraints: 0<=n<=1e6
*/
import java.util.*;

public class Recursion_08 {
    static int seriesSum(int n) {

        // base condition
        if (n == 0)
            return 0;

        // recursive condition
        if (n % 2 == 0)
            return seriesSum(n - 1) - n;

        else
            return seriesSum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
    }

}
