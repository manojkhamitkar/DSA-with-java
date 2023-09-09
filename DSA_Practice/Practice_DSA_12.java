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
public class Practice_DSA_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  two string : ");
        //string str1 = input.nextInt();
        String str1, str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        String[] words = {str1,str2};
        String[][] parts = new String[2][3];
        for(int i =0; i < 2 ; i++)
        {
            int len = words[i].length();
            if(len%3==0 || len%3==1)
            {
                parts[i][0] = words[i].substring(0, len/3);
                parts[i][1] = words[i].substring(len/3, len-len/3);
                parts[i][2] = words[i].substring(len-len/3);

            }
            else{
                parts[i][0] = words[i].substring(0, len/3+1);
                parts[i][1] = words[i].substring(len/3+1,len-len/3-1);
                parts[i][2] = words[i].substring(len/3-1);
            }
           
        }
        System.out.println(parts[1][2]+parts[0][1]+parts[1][1]+parts[0][0]);
    }
    }
    

