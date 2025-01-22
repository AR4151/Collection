package Collectionn.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RemDup {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(258);
        l.add(468);
        l.add(469);
        l.add(136);
        l.add(466);
        l.add(465);
        l.add(52);
        l.add(136);
        l.add(468);
        l.add(258);
        System.out.println("ArrayList Before removing duplicates: \n"+l);
        System.out.println("elements present in Arraylist: "+l.size());
        System.out.println();
        HashSet<Integer> set = new HashSet<>(l);
        ArrayList<Integer> dupRemoved = new ArrayList<>(set);
        System.out.println("ArrayList After removing duplicates:\n"+dupRemoved);
        System.out.println("elements present in Arraylist after removing duplicates: "+dupRemoved.size());

    }
}
