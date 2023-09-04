/* You are provided with TWO words. You are expected to split each word into THREE parts
each, and create a password using the below rule –
Password = Third part of word2 + Second part of word1 + Second part of word2 + First
part of word1
For splitting a given word into three parts the below approach should be used
If word= "ABC" then part1=A, part2=B and part3=C
if word= "ABCD" then part1=A, part2=BC and part3=D
if word= "ABCDE" then part1=AB, part2=C and part3=DE
if word= "ABCDEF" then part1=AB, part2=CD and part3=EF
if word= "ABCDEFG" then part1=AB, part2=CDE and part3=FG
if word = "ABCDEFGH" then part1=ABC, part2=DE and part3=FGH
and so on
i.e.,
1) If the length of the given word can be equally divided into three parts, then each part
gets the same number letters (as seen in above examples of "ABC" and "ABCDEF")
2) If after dividing the length of the given word into three parts, there is one extra character
left, then the extra Character goes to the middle part i.e., part2. (as seen in above
examples of "ABCD" and "ABCDEFG")
3) If after dividing the length of the given word into three parts, there are two extra
characters left, then part1 and part3 get the extra characters (as seen in above
examples of "ABCDE" and "ABCDEFGH") */
package DSA_Practice;
import java.util.*;
public class Practice_DSA_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        //string str1 = input.nextInt();
       String str;
        str = sc.nextLine();
            System.out.println(str);
    }
    
}
