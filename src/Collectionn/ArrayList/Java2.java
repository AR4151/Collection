package Collectionn.ArrayList;

import java.util.ArrayList;
import java.util.List;
// 2.Write a Java program to iterate through all elements in an array list.
public class Java2 {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(15);
        i.add(85);
        i.add(25);
        i.add(65);
        i.add(62);
        i.add(32);
        i.add(82);
        i.add(22);
        for(int l : i){
            System.out.println(l);
        }
    }
}
