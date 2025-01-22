/*Write a Java program to find all pairs of elements in the given array whose sum is equal to a given number.
For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
then you have to find all pairs of elements in this array whose sum must be 20.
In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
*
* */

import java.util.HashSet;

public class ArraySum {
    public static void findPairs(int[] array, int Sum) {

        HashSet<Integer> numbers = new HashSet<>();

        System.out.println("Pairs with sum " + Sum + " -");

        for (int number : array) {

            int complement = Sum - number;

            if (numbers.contains(complement)) {
                System.out.println("(" + complement + ", " + number + ")");
            }

            numbers.add(number);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 7, 11, 9, 13, 8, 12};
        int Sum = 20;
        int Sum1 = 9;

        findPairs(array,Sum);
        findPairs(array,Sum1);
    }

}
