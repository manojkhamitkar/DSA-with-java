package ArrayList;

import java.util.*;

public class ArrayList_02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("initally the size of arrayList : " + arrayList.size());

        arrayList.add("M");
        arrayList.add("a");
        arrayList.add("n");
        arrayList.add("o");
        arrayList.add("j");
        arrayList.add("k");
        System.out.println("Size of arrayList after inserting elements : " + arrayList.size());

        // display the array list
        System.out.println("Elements of arrayList are " + arrayList);
        arrayList.add(10);
        arrayList.add("@");
        System.out.println("Elemets of arrayList after inserting 2 elements are " + arrayList);

        // Remove elements from the array list
        arrayList.remove("k");
        arrayList.remove("@");
        System.out.println("Size of arraylist after deletions of 2 elements: " + arrayList.size());
        System.out.println("Elements of arraylist are " + arrayList);

    }

}
