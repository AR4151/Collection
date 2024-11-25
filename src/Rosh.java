import java.util.Arrays;

public class Rosh {
    Object[] arr;
    private static final int INITIAL_CAPACITY = 6;
    private int size = 0;
    Rosh(){
        arr = new Object[INITIAL_CAPACITY];
    }
    public void add(Object ele){
        if(size == arr.length ){
            resizeArray();
        }
        arr[size++] = ele;
    }
    public void resizeArray(){
        arr = Arrays.copyOf(arr,arr.length*2);
    }
    public String toString(){
        StringBuffer s = new StringBuffer("[ ");
        for( int i=0;i<size;i++){
            s.append(arr[i]).append(" ");

        }
        return s+"]";
    }


}

class Display{
    public static void main(String[] args) {
        Rosh r = new Rosh();
        r.add(15);
        r.add("Roshan");
        r.add(25);
        r.add("Rohan");
        r.add("Rohan");
        r.add("Rohan");
        r.add("Raj");
        System.out.println(r);
    }

}