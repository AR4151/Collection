import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        int[] arr1 = {35, 20, 85, 36, 25};
        int[] arr2 = {15, 20, 65, 26, 25};
        int[] arr3 = {45, 20, 75, 66, 25};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();



        int temp1 = 0;
        int temp2 = 0;
        int[] common = new int[arr1.length];
        int[] un_common = new int[arr1.length + arr2.length + arr3.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i] ) {
                if (arr2[i] == arr3[i]) {
                    common[temp1] = arr1[i];
                    list.add(common[temp1]);
                    temp1++;

                }
            }

        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i] || arr2[i] != arr3[i]) {
                un_common[temp2] = arr1[i];
                list1.add(un_common[temp2]);
                temp2++;
                un_common[temp2] = arr2[i];
                list1.add(un_common[temp2]);
                temp2++;
                un_common[temp2] = arr3[i];
                list1.add(un_common[temp2]);
                temp2++;
            }


        }
        /*System.out.println(Arrays.toString(common));
        System.out.println(Arrays.toString(un_common));*/
        System.out.println(list);
        System.out.println(list1);

    }
}
