package Collectionn.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class Java3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(15);
        list.add(85);
        list.add(25);
        list.add(65);
        list.add(62);
        list.add(32);
        list.add(82);
        list.add(22);
        System.out.println("Before: "+list);
        // 3.Write a Java program to insert an element into the array list at the first position.
        System.out.println("Setting element at first position");
        list.set(0,55);
        System.out.println("After: "+list);
        System.out.println();

        //4.Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("Retrieve an element at specified index");
        System.out.println(list.get(5));
        System.out.println();

        //5.Write a Java program to remove the third element from an array list.
        System.out.println("Removing 3rd element from the ArrayList");
        System.out.println("Before Removing");
        System.out.println(list);
        list.remove(2);
        System.out.println("After Removing:");
        System.out.println(list);
        System.out.println();

        //6.Write a Java program to search for an element in an array list.
        System.out.println("Contains element or not");
        System.out.println(list.contains(82));
        System.out.println();

        //7. Write a Java program to sort a given array list.
        System.out.println("Before Sorting: \n"+list);
        Collections.sort(list);
        System.out.println("After Sorting: \n"+list);
        System.out.println();

        //8.Write a Java program to copy one array list into another.
        System.out.println("copy one array list into another:");
        ArrayList<Integer> list1 = new ArrayList<>(list);
        list1.add(50);
        System.out.println(list1);
        System.out.println();

        //9.Write a Java program to reverse elements in an array list.
        System.out.println("Before Reversing \n"+list1);
        System.out.println("After Reversing ");
        Collections.reverse(list1);
        System.out.println(list1);
        System.out.println();

        //10.Write a Java program to extract a portion of an array list.
        System.out.println("Original List \n"+list1);
        System.out.println("Sub_List \n"+list1.subList(2,8));
        System.out.println();

        //11.Write a Java program to shuffle elements in an array list.
        System.out.println("Original List: \n"+list1);
        Collections.shuffle(list1);
        System.out.println("After Shuffling: \n"+list1);
        System.out.println();

        //12.Write a Java program to compare two array lists.
        System.out.println("Comparing two list: ");
        System.out.println(list.equals(list1));
        System.out.println();

        //13.Write a Java program that swaps two elements in an array list.
        System.out.println("Before Swapping \n"+list1);
        Collections.swap(list1,1,3);
        System.out.println("After Swapping \n"+list1);
        System.out.println();

        //14.Write a Java program to join two array lists.
        System.out.println("First List: \n"+list);
        System.out.println("Second List: \n"+list1);
        ArrayList<Integer> join = new ArrayList<>(list);
        join.addAll(list1);
        System.out.println("After Joining: \n"+join);
        System.out.println();

        //15.Write a Java program to empty an array list.
        System.out.println("Before: \n"+list);
        //System.out.println("After: \n");
        list.clear();
        System.out.println("After: \n"+list);
        System.out.println();

        //16.Write a Java program to test whether an array list is empty or not.
        System.out.println(list);
        System.out.println("Checking list is Empty or not: \n"+list.isEmpty());
        System.out.println();

        //17.Write a Java program to clone an array list to another array list.
        System.out.println("list1: \n"+list1);
        ArrayList<Integer> clone = (ArrayList<Integer>) list1.clone();
        System.out.println("cloned list: \n"+clone);
        System.out.println();

        //18.Write a Java program for trimming the capacity of an array list.
        System.out.println("Trimming to size: \n"+list1);
        list1.trimToSize();
        System.out.println(list1.size());
        System.out.println();

        //19.Write a Java program to increase an array list size.
        list1.ensureCapacity(list.size()*2);
        System.out.println();

        //20.Write a Java program to replace the second element of an ArrayList with the specified element.
        System.out.println("Before Inserting: \n"+list1);
        list1.set(1,55);
        System.out.println("After Inserting: \n"+list1);
        System.out.println();

        //21.Write a Java program to print all the elements of an ArrayList using the elements' position.
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        

    }


}
