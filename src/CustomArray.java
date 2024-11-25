import java.util.Arrays;

public class CustomArray {
    private static final int INITIAL_CAPACITY = 10;
    Object[] arr;
    private int size = 0;

    CustomArray(){
        arr = new Object[INITIAL_CAPACITY];

    }
    public void add(Object ele){
        if(size == arr.length){
            resizeArray();
        }
        arr[size++] = ele;

    }
    public void resizeArray(){
        arr = Arrays.copyOf(arr,arr.length*2);
    }
    public void remove( int index){
        if(index >= arr.length || index<0){
            throw new IndexOutOfBoundsException("Invalid Exception "+index);

        }
        for (int i = index; i < size ; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null;
    }
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
class Show{
    public static void main(String[] args) {
        CustomArray l = new CustomArray();
        l.add(15);
        l.add(20);
        l.add(18);
        l.add(12);
        l.add(12);
        l.add(12);
        l.add(12);
        l.add(12);
        l.add(12);
        l.add(12);
        l.add(12);
        l.add(12);
        l.remove(20);
        l.printAll();
        System.out.println(l);
    }
}
