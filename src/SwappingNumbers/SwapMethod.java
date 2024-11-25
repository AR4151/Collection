package SwappingNumbers;

public class SwapMethod {
    public static void swapNum(int a ,int b){
        int swap;
        System.out.println("Before Swapping-\nThe value of a is "+a+"\nThe value of b is "+b);
        swap = b;
        b=a;
        a=swap;
        System.out.println("After Swapping-\nThe value of a is "+a+"\nThe value of b is "+b);

    }
    public static void swapNumb(int a ,int b){
        System.out.println("Before Swapping a and b is "+a+" & "+b+" respectively");
        b= a+b -(a=b);
        System.out.println("After Swapping a and b is "+a+" & "+b+" respectively");
    }
    public static void swapNumber(int a ,int b){
        System.out.println("Before Swapping a and b is "+a+" & "+b+" respectively");
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("After Swapping a and b is "+a+" & "+b+" respectively");

    }


    public static void main(String[] args) {
        swapNum(15,20);
        swapNumb(15,20);
        swapNumber(20,25);
    }
}
