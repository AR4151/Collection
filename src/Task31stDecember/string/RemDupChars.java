package Task31stDecember.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

//Q4-> How to find duplicate characters in a string in Java?
class RemDupChars {
    public static void countOfCharacters(String name) {
        int[] charCount = new int[256]; // ASCII character frequency array


        // Count the frequency of each character
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            charCount[currentChar]++;
        }

        // Display the count of each character
        System.out.println("Character counts:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i +":"+charCount[i]);
            }
        }
    }
    //Using HashMap
    public static void countByHashSet(String inputString){
        char[] strChar = inputString.toCharArray();
        HashMap<Character,Integer> strHash = new HashMap<>();
        for(char  c: strChar){
            if(strHash.containsKey(c)){
                strHash.put(c,strHash.get(c)+1);
            }
            else {
                strHash.put(c,1);
            }
        }
        //System.out.println(strHash);
        strHash.entrySet().stream().filter(entry->entry.getValue()>1).forEach(entry-> System.out.println(entry.getKey()+":"+entry.getValue()));

    }

    public static void main(String[] args) {
        countOfCharacters("HelloJava");
        countOfCharacters("HiiiiByyyeeee");
        System.out.println();
        countByHashSet("Helloo000lll");
    }
}

