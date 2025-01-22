package Collectionn.Set;

import java.util.HashSet;
import java.util.TreeSet;


public class Hashset<I extends Number> {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(15);
        set.add(85);
        set.add(25);
        set.add(65);
        set.add(62);
        set.add(32);
        set.add(82);
        set.add(22);

        //6.Write a Java program to clone a hash set to another hash set.
        HashSet<Integer> set1 = (HashSet<Integer>) set.clone();
        System.out.println(set1);
        System.out.println();
        
        //1.Write a Java program to append the specified element to the end of a hash set.

        set.add(44); // --> But HashSet does not print elements as per Insertion Order.

        //2.Write a Java program to iterate through all elements in a hash list.
        System.out.println("Iterating one by one:");
        for(Integer i : set){
            System.out.println(i);
        }
        System.out.println();

        //3.Write a Java program to get the number of elements in a hash set.
        System.out.println(set);
        System.out.println("Number of elements present in given set: "+set.size());
        System.out.println();

        //4.Write a Java program to empty a hash set.
        System.out.println("Before: \n"+set);
        set.clear();
        System.out.println("After: \n"+set);
        System.out.println();

        //5.Write a Java program to test if a hash set is empty or not.
        System.out.println("Checking HashSet is Empty or Not: \n"+set.isEmpty());
        System.out.println();

        //7.Write a Java program to convert a hash set to an array.
        System.out.println("Converting to Array");
        Object[] arr = set1.toArray();
        for(Object i : arr){
            System.out.println(i);
        }
        System.out.println();

        //8.Write a Java program to convert a hash set to a tree set.
        System.out.println("Converted to TreeSet");
        TreeSet<Integer> tr = new TreeSet<>(set1);
        System.out.println(tr);
        System.out.println();

        //9.Write a Java program to find numbers less than 25 in a tree set.
        TreeSet<Integer> less = (TreeSet<Integer>) tr.headSet(25);
        System.out.println("Printing Elements less the 25: \n"+less);
        System.out.println();

        //10.Write a Java program to compare two hash set.
        System.out.println("Comparing two HashSet: \n"+set.equals(set1));
        System.out.println();

        //11.Write a Java program to compare two sets and retain elements that are the same.
        System.out.println("set before calling retainAll: \n"+set1);
        set.add(62);
        set.add(32);
        set.add(82);
        set.add(22);
        System.out.println(set1.retainAll(set));
        System.out.println("After calling retainAll: \n"+set1);
        System.out.println();

        //12.Write a Java program to remove all elements from a hash set.
        System.out.println("Before Removing: \n"+set1);
        set1.clear();
        System.out.println("After Removing: \n"+set1);






        



        

    }


}
