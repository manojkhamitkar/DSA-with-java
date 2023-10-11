// Write a program to Reverse the given ArrayList.

package ArrayList;

import java.util.*;

//import java.io.*;
public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        list.add(13);
        System.out.println("Before reverse: ");
        print(list);
        System.out.println("");
        for (int i = 0; i < list.size() / 2; i++) {
            Integer t = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, t);
        }
        System.out.println("After reverse: ");
        print(list);

    }

    public static void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
