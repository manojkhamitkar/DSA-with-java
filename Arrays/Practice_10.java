// Swaping of two values.

import java.util.*;
public class Practice_10{
static void swap(int a,int b){
    System.out.println("Original values before swap");
    System.out.println("a "+a);
    System.out.println("b "+b);

    // Metohd-1
    int temp =a;
    a=b;
    b=temp;

    //method-2
    a= a+b;
    b=a-b;
    a=a-b;

    System.out.println("Original values after swap");
    System.out.println("a "+a);
    System.out.println("b "+b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[] arr ={1,2,3,4,5};
        swap(a,b);
    }
}