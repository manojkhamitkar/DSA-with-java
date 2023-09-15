/* Mohan has received an array of numbers
The numbers in this array are special because each number consists of two parts -a “KEY”
part and a “NEXT ADDRESS” part For example, if the number in the array is 411, the leftmost
digit in the number is “4” is the “KEY part and all the remaining digits in number be “11 form
the “NEXT ADDRESS part.
Mohan’s task is to start from the first array element, pick the “KEY”part go to the “NEXT
ADDRESS array element pick Its “KEY” part, go to the “NEXT ADDRESS array element, pick
its “KEY part, and continue this cycle the encounters a negative number While traversing
through the array in this fashion, we need to perform an alternate addition and subtraction of
the KEYS.
The result of alternate addition and subtraction of all the keys is the expected final result. Note
that we should stop traversing (traveling) through the array when a negative number is
encountered (See Examples 1 and 2 below) Important: If the array does NOT contain any
negative number, the result should be the largest number in the array (See Example 3 below)
Help Mohan by writing the code to find the FINAL Result. Input1 represents the array of
numbers, and input2 represents the number of elements in the array. */

package DSA_Practice;
import java.util.*;
public class Practice_DSA_16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int input2 ;
        input2 = sc.nextInt();
        int[] input1 = new int[input2];
        System.out.println("Enter input1");
        for(int i = 0; i < input2; i++){
            input1[i] = sc.nextInt();
        }
        System.out.println("Enter input2");
        int i, flag=0;
        int max = Integer.MIN_VALUE;
            for(i=0;i<input2;i++)
            {
                if(input1[i]<0)
                    flag=1;
                if(input1[i]>max)
                    max=input1[i];
            }
        if(flag==0)
            System.out.println(max);
            int sign=-1, res=0, key, digits, power;
        i=0;
            while(i<input2 && flag==1)
            {
                if(input1[i]<0)
                    {
                        flag=0;
                            input1[i]*=-1;
                    }
        digits = (int)(Math.log10(input1[i])+1);
        power = (int)(Math.pow(10, digits-1));
        key = (int)input1[i]/power;
        if(i==0)
        res = key;
        else
        res = res + key*(sign=sign*-1);
        i = input1[i]%power;
        }
        System.out.println( res);

    }
}
