// Swaping of two values.

import java.util.*;
public class Practice_10{
static void swap(int a,int b){
    System.out.println("Original values before swap");
    System.out.println("a "+a);
    System.out.println("b "+b);
    int temp =a;
    a=b;
    b=temp;
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