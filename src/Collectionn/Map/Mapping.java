package Collectionn.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapping {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        //1.Write a Java program to associate the specified value with the specified key in a HashMap.
        map.put(1,"red");
        map.put(2,"blue");
        map.put(3,"green");
        map.put(4,"yellow");
        map.put(5,"white");
        map.put(6,"black");
        System.out.println(map);
        System.out.println();

        //2.Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("key-value count: "+map.size());
        System.out.println();

        //3.Write a Java program to copy all mappings from the specified map to another map.
        HashMap<Integer,String> map1 = new HashMap<>(map);
        System.out.println(map1);
        System.out.println();

        //4.Write a Java program to remove all mappings from a map.
        System.out.println("Before Removing: \n"+map1);
        map1.clear();
        System.out.println("After Removing: \n"+map1);
        System.out.println();

        //5.Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("map is Empty: "+map.isEmpty());
        System.out.println("map1 is Empty: "+map1.isEmpty());
        System.out.println();

        //6.Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer,String> clone = ((HashMap<Integer, String>) map.clone());
        System.out.println("Cloned map: \n"+clone);
        System.out.println();

        //7.Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println(map);
        System.out.println("Contains Key: "+map.containsKey(3));
        System.out.println();

        //8.Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println(map);
        System.out.println("Contains Value: "+map.containsKey(2));
        System.out.println();

        //9.Write a Java program to create a set view of the mappings contained in a map.
        Set<Map.Entry<Integer, String>> setView = map.entrySet();
        System.out.println("Set view of map: \n"+setView);
        System.out.println();

        //10.Write a Java program to get the value of a specified key in a map
        System.out.println(map);
        int key = 4;
        System.out.println("Getting Value associated with given Key "+key+" is "+map.get(4));
        System.out.println();

        //11.Write a Java program to get a set view of the keys contained in this map.
        System.out.println(map1);
        Set<Integer> set = map.keySet();
        System.out.println("Set view of Keys in map: \n"+set);
        System.out.println();

        //12.Write a Java program to get a collection view of the values contained in this map.
        Collection<String> collection = map.values();
        System.out.println("Collection view of map: \n"+collection);




    }
}
