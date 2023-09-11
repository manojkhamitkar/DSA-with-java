/* Detective Buckshee junior has been approached by the shantiniketan kids society for help in
finding the password to the games complex.After hearing the scenario,detective Buckshee
junior realises that he will need a programmer's support.He contacts you requests your help.
Please help the detective by writing a function to generate the password.
The scenario is as below Five numbers are available with the kids.
These numbers are either stable or unstable
A number is stable if each of its digits occur the same number of times, i.e the frequency of each digit
in the number is the same.
For e.g:2277,4004,11,23,583835,1010 are examples of stable numbers.
Similarly,A number is unstable if the frequency of each digit in the number is NOT the same.For
eg:221,4314,101,233,58135,101 are examples of unstable numbers.
The password can be found as below i.e password=(Number of unstable numbers*10)+Number of stable
numbers */
package DSA_Practice;

import java.util.*;
public class Practice_DSA_18 {
    public static void main(String[] args) {
    Scanner sc=  new Scanner(System.in);
    System.out.println("Enter 5 inputs of stable & unstable numbers");
    int input1 = sc.nextInt();
    int input2 = sc.nextInt();
    int input3 = sc.nextInt();
    int input4 = sc.nextInt();
    int input5 = sc.nextInt();
    int[] num = {input1, input2, input3, input4, input5};
    int stable = 0 , unstable = 0, i, j;
    for(i=0;i<5;i++){
        int[] freq = new int[10];
        int temp = num[i];
        int maxf=0;
        while(temp!=0)
        {
            int r = temp%10;
            freq[r]++;
            temp = temp/10;
            if(freq[r]>maxf)
            maxf=freq[r];
        }
        for(j=0;j<10;j++){
            if(freq[j]!=0 && freq[j]!=maxf)
            break;
        }
        if(j==10)
        stable++;
        else
        unstable++;
    }
    System.out.println(unstable*10 + stable);

    }
}