import java.util.Arrays;
import java.util.SplittableRandom;

public class Even {
    public static void main(String[] args) {
        int[] arr = {15, 45, 24, 12, 17, 69, 88, 79, 60, 20,88,87};

        int[] even = new int[arr.length];
        int[] Odd = new int[arr.length];
        //System.out.println(even.length);
        int j=0;
        int k=0;
        for (int value : arr) {
            if (value % 2 == 0) {
                even[j] = value;
                j++;
            }
            /*if (value % 2 != 0) {
                Odd[k] = value;
                k++;
            }*/

        }
        for (int value1 : arr) {
            if (value1 % 2 != 0) {
                even[j] = value1;
                j++;
            }
        }
        System.out.println("Even Numbers: ");
        for(int i=0;i<j;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println("Odd Numbers: ");
        for(int i=0;i<k;i++){
            System.out.print(Odd[k]+" ");
        }
    }
}

