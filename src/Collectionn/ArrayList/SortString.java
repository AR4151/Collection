package Collectionn.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//Write a program to sort an ArrayList of Strings alphabetically.
public class SortString {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1;
                String s2 = o2;
                return -o1.compareTo(o2);
            }
        };
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("white");
        list.add("yellow");
        list.add("blue");
        list.add("purple");
        list.add("pink");
        System.out.println("Before Sorting: \n"+list);
        Collections.sort(list);
        System.out.println("After Sorting using Collections sort method: \n"+list);
        //ArrayList<String> list1 = new ArrayList<>(list);
        list.sort(comp);
        System.out.println("Descending Sorting Order using Comparator: \n"+list);




    }
}