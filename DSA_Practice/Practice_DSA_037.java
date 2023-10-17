/* JUMBLED WORDS
Wipro plans to publish a daily online newsletter on its internal website channelW,and you have been
contacted to contribute to the JUMBLE game on the newsletter's fun page.The JUMBLE game presents
a sentence with each word jumbled,and the readers will be expected to unjumble them.
Your task is to provide the sentence in jumbled format, i.e each word in the sentence jumbled in some
fashion.
Because your task is to provide a jumbled sentence every day,you decide to write a program that can
take any proper sentence as input, and jumble the words in that sentence to produce a jumbled
sentence.
After some thought you decide below two ways of jumbling a word.....
Method-1(forward,backward):In the word,reading left to right(forward),Pick every odd letter starting
from the first letter,and then reading the word from right to left(backward),pick every even letter
starting from the last even letter in the word.
For example,
If the word is "PROJECT"the jumbled word will be "POETCJR"
Similarly,
If the word is "LEARNING" the jumbled word will be "LANNGIRE"
So,If the sentence is "PROJECT BASED LEARNING",the sentence with jumbled words should be
"POETCJR BSDEA LANNGIRE".
Method-2(forward,forward):In the word,reading from left to right(forward),Pick every odd letter
starting from the first letter, and then reading the word again from left to right(forward),pick every
even letter starting from the second letter in the word
For example,
If the word is "PROJECT", the jumbled word will be "POETRJC".
Similarly,
If the word is "LEARNING" the jumbled word will be "LANNERIG"
So,If the sentence is "PROJECT BASED LEARNING",the sentence with jumbled words should be
"POETRJC BSDAE LANNERIG".
The function JumbledWords takes two inputs input1 which reperesents the string(proper sentence)containing one or more words that are to be
jumbled.
input2 which represents the type of jumbling method(1 0r 2)
The function is expected to jumble the words in given sentence(input1) based on the jumbling method
specified(input2) and return the result(i.e sentence with each word jumbled).
Example1:
input1="PROJECT BASED LEARNING"
input2=1
Expected output="POETCJR BSDEA LANNGIRE"
Example2:
input1="PROJECT BASED LEARNING"
input2=2
Expected output="POETRJC BSDAE LANNERIG"
Example3:
input1="WIPRO LIMITED"
input2=1
Expected output="WPORI LMTDEII"
Example4:
input1="WIPRO LIMITED"
input2=2
Expected output="WPOIR LMTDIIE */
package DSA_Practice;

import java.util.*;

public class Practice_DSA_037 {
    public static String jumbledWords(String input1, int input2) {
        String s[] = input1.split(" ");
        String s1 = "", res = "", even = "", odd = "";
        for (int i = 0; i < s.length; i++) {
            s1 = s[i];
            even = "";
            odd = "";
            for (int j = 0; j < s1.length(); j++) {
                if (j % 2 == 0)
                    even += String.valueOf(s1.charAt(j));
                else
                    odd += String.valueOf(s1.charAt(j));
            }
            if (input2 == 1)
                res += even + String.valueOf(new StringBuffer(odd).reverse()) + " ";
            else
                res += even + odd + " ";
        }

        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        int input2 = sc.nextInt();
        jumbledWords(input1, input2);

    }

}
