package Task31stDecember.array;

import java.util.Arrays;

public class ArrayEquals {

    public static boolean equalsArray(int[] arr1, int[] arr2){
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {35, 20, 85, 36, 25,45};
        int[] arr2 = {15, 20, 65, 26, 25,15};

        int[] arr3 = {10,20,30};
        int[] arr4 = {20,10,30};

        boolean equalsOrNot = true;
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    equalsOrNot=false;
                }
            }
        }
        else{
            equalsOrNot=false;
        }
        if(equalsOrNot){
            System.out.println("Two Arrays are Equal");
        }
        else {
            System.out.println("Two Arrays are Not equal");
        }
        System.out.println(equalsArray(arr1,arr2));
        System.out.println(equalsArray(arr3,arr4));
    }
}
