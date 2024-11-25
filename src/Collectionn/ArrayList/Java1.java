package Collectionn.ArrayList;


import java.util.ArrayList;
import java.util.List;

/* 1.Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */
public class Java1 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("white");
        colors.add("yellow");
        colors.add("blue");
        colors.add("purple");
        colors.add("pink");
        System.out.println(colors);
    }
}
