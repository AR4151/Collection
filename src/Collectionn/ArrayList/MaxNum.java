package Collectionn.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(258);
        l.add(468);
        l.add(469);
        l.add(136);
        l.add(466);
        l.add(465);
        l.add(52);
        System.out.println("Max element from the given list of Integers using Collections methods: \n"+Collections.max(l));
        //Comparator<Integer> comp = Integer::compareTo;
        Comparator<Integer> comp = (o1,o2)-> {
            Integer i = o1;
            Integer j = o2;
            return i.compareTo(j);
        };
        System.out.println("Using Lambda Expression: \n"+l.stream().max(comp).get());

    }
}
