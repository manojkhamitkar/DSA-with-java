/* Kely has been tricked by her brother to answer a question with a number. She is perplexed. Here is the
question “Fo+23the3*like2+” it took time for her to understand. Now she wants to automate it with a
program so that any time her brother comes with such tricky String she could answer with lesser
efforts.
Here is what we have to do, separate the math operators and the digits.
Like in the above String you can see the operators (+,*,+) and digits (2,3,3,2).
Rest all characters are ignored
No arrange the digits and operators in the order of the appearance to get the correct result.
2+3*3+2 to be solved as
(2+3) = 5
Then, (5*3)=15
Then (15+2) = 17
So for the given String Fo+23the3*like2+final answer is 17
Help kely by writing a program to solve the above given problem.
Prototype: Public int fix TheFormula(String inpt1)
Assumptions:
1. Numbers present in the String are always considered as single digits(0-9)
2. Only operators used in the String are(+,-,*,/)
3. Always we will have length +1 numbers to operators (int the above example 3 operators and 4
numbers)
Sample Input/Output-1
Input1= we8+you2-7to/*32
Output=2
Explanation: Here the operators are [+,-,/,*] and the numbers are [8,2,7,3,2]
Thus we would be getting 8+2=>10-7=>3/3=>1*2=>2
Final answer is 2.
Sample Input/Output-2
Input1= i*-t5s-t8h1e4birds
Output=35
Explanation: Here the operators are [+,-,-] and the numbers are [5,8,1,4]
Thus we would be getting 5*8=>40-1=>39-4=>35
Final answer is 35. */
package DSA_Practice;

import java.util.*;

public class Practice_DSA_038 {
    static int fixTheFormula(String input1) {
        int d[] = new int[input1.length()];
        char c[] = new char[input1.length()];
        int k1 = 0, k2 = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (!Character.isLetter(input1.charAt(i))) {
                if (Character.isDigit(input1.charAt(i))) {
                    d[k1++] = Integer.parseInt(String.valueOf(input1.charAt(i)));
                } else {
                    c[k2++] = input1.charAt(i);
                }
            }
        }
        int res = d[0], k = 1;
        for (int i = 0; i < k2; i++) {
            if (c[i] == '+') {
                res += d[k];
            } else if (c[i] == '-') {
                res -= d[k];
            } else if (c[i] == '*') {
                res *= d[k];
            } else {
                res /= d[k];
            }
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        fixTheFormula(input1);
    }

}
