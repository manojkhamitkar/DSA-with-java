/* WEIGHT OF HILL PATTERNS
Given,
the total levels(rows) in a hill pattern (input1),
the weight of the head level(first row) as input2, and
the weight increments of each subsequent row as input3,
you are expected to find the total weight of the hill pattern.
"Total levels" represents the number of rows in the pattern.
"Head level" represents the first row.
Weight of a level represents the value of each star (asterisk) in that row.
Note that the first row will have the weight of the head level,and the weight of each subsequent row
will keep increasing by the specified "weight increment".
The hill patterns will always be of the below format, starting with 1 star at head level and increasing 1
star at each level till level N.From second level(second row) a hash # also gets added to the pattern.
*
*#*
*#*#*
*#*#*#*
*#*#*#*#*
*#*#*#*#*#*
. . .and so on till level N
While the weight of a star * is equal to the weight of the current level(current row),the weight of the
hash # is equal to the weight of the previous level(previous row)
Let us see a couple of examples.
Example1 -
Given,
the total levels(total rows) in the hill pattern = 5 (input1)
the weight of the head level (first row) = 10(input2)
the weight increments of each subsequent level = 2(input3)
Then, The total weight of the hill pattern will be calculated as = 10 + (12+10+12) + (14+12+14+12+14) +
(16+14+16+14+16+14+16) + (18+16+18+16+18+16+18+16+18) = 10 + 34 + 66 + 106 + 154 = 370
Example2 -
Given,
the total levels in the hill pattern = 4(input1)
the weight of the head level = 1(input2)
the weight increments of each subsequent level = 5(input3)
Then, Total weight of the hill pattern will be = 1 + (6+1+6) + (11+6+11+6+11) +
(16+11+16+11+16+11+16) = 1 + 13 + 45 + 97 = 156 */

package DSA_Practice;

import java.util.*;

public class Practice_DSA_036 {
    public static void Hill(int input1, int input2, int input3) {
        int hash;
        hash = input2;
        int sum1 = 0, sum = 0;
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j <= i; j++) {
                sum = sum + input2;
            }
            input2 = input2 + input3;
            for (int k = 0; k <= i && i != input2 - 1; k++) {
                sum1 = sum1 + hash;
            }
            hash = hash + input3;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        Hill(input1, input2, input3);
    }

}
