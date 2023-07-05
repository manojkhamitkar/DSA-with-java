// Find the last occurence of an element x in a given array.

import java.io.*;
import java.util.*;
public class Practice_04 {
   
        public static int lastOccurance(int a[],int x){
            int index =-1;
            for(int i =0;i<a.length;i++){
                if(a[i]== x)
                index =i;
            }
            return index;
        }
        public static void main(String[] args) {
            int a[] ={1,4,7,9,1};
            System.out.println(lastOccurance(a,1));
    }
}