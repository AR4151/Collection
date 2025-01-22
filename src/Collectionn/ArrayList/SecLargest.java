package Collectionn.ArrayList;

import java.util.*;

public class SecLargest {
    static void secondLargest(ArrayList<Integer> list){
        HashSet<Integer> l1 = new HashSet<>(list);
        ArrayList<Integer> arr = new ArrayList<>(l1);
        System.out.println("Given ArrayList"+list);
        arr.sort((o1, o2) -> -o1.compareTo(o2));

        System.out.println("Second Largest Element form the given ArrayList: "+arr.get(1));

    }
    public static void main(String[] args) {

        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(15);
        ll.add(68);
        ll.add(2);
        ll.add(15);
        ll.add(25);
        ll.add(54);
        ll.add(28);
        secondLargest(ll);

    }
}
