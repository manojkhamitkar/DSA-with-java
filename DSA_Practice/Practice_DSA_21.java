/* Detective Buckshee junior has been approached by the shantiniketankids society for help in
finding the password to the games complex. After hearing the scenario, detective Buckshee
junior realizes that he will need a programmer's support. He contacts you requests your help.
Please help the detective by writing a function to generate the password.
The scenario is as below Five numbers are available with the kids.
These numbers are either stable or unstable
A numbers is stable if each of its digit occur the same number of times, i.e the frequency of each digit
in the number is the same.
For e.g:2277,4004,11,23,583835,1010 are examples of stable numbers.
Similarly, A number is unstable if the frequency of each digit in the number is NOT the same. For
eg:221,4314,101,233,58135,101 are examples of unstable numbers.
The password can be found as below i.e Password=sum of all stable numbers - sum of all Unstable numbers
Assuming that the five numbers are passed to a function as input1, input2, input3, input4, input5.
Complete the function to find and return the password.

For example:-------
If input1=12,input2=1313,input3=122,input4=678 and input5=898 , we see that there are THREE stable
numbers 12,1313 and 678 and
TWO unstable numbers 122 and 898
So, the password should be=sum of all stable numbers – sum of all Unstable numbers=983 */
package DSA_Practice;
import java.util.*;

public class Practice_DSA_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            int input3 = sc.nextInt();
            int input4 = sc.nextInt();
            int input5 = sc.nextInt();
            int[] num = {input1, input2 ,input3 , input4  , input5};
            int stable = 0 , unstable = 0, i, j;
            for(i=0;i<5;i++)
            {
                int[] freq = new int[10];
                int temp = num[i];
                int  maxf =0;
                while(temp!=0)
                {
                    int r = temp%10;
                    freq[r]++;
                    temp/=10;
                    if(freq[r]>maxf)
                    maxf=freq[r];
                }
                for(j=0;j<10;j++)
                {
                    if(freq[j]!=0 && freq[j]!=maxf)
                    break;
                }
                if(j==10)
                stable=stable+num[i];
                else
                unstable=unstable+num[i];
            }
            System.out.println(stable-unstable);

    }
    
}
