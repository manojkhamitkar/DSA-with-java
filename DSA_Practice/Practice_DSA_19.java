package DSA_Practice;

import java.util.*;
public class Practice_DSA_19 {
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
    System.out.println(stable*10 + unstable);

    }
}