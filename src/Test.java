import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = {15, 45, 24, 12, 17, 69, 88, 79, 60, 20, 88, 87, 59};
        System.out.println();
        int[] even = new int[arr.length];
        int[] Odd = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        //System.out.println(even.length);
        int j=0;
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[j] = arr[i];
                list.add(even[j]);
                j++;


            }
            else{
                Odd[k] = arr[i];
                list1.add(Odd[k]);
                k++;
            }

        }
        System.out.println(list);
        System.out.println(list1);

    }
}