import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test3 {

    public static void main(String[] args) {
        int[] arr1 = {35, 20, 85, 36, 25,45};
        int[] arr2 = {15, 20, 65, 26, 25};
        int[] arr3 = {45, 20, 75, 66, 25,55,89};
        int l = arr1.length + arr2.length + arr3.length;
        int temp =0;
        int [] common = new int[temp];
        for(int i=0;i<l;i++){
            if(arr1[i]==arr2[i] && arr2[i]==arr3[i]){
                common[i]=arr1[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(common));
    }
}

