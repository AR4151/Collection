package java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<String> list = List.of("Roshan","rohan","Ayush","Ayus","Shubham","yash","John, Emma, Oliver, Sophia, Liam," +
                " Ava, Noah, Mia, James, Isabella, Elijah, Charlotte, Lucas, Amelia");

        List<String> sorted = list.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sorted);
    }
}
