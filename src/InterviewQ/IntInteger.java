package InterviewQ;

public class IntInteger {
    public static void main(String[] args) {
        Integer x = 10;
        int y = 11111;


        System.out.println(x);  // 10

        System.out.println(y);  //11111

        fun(x, y);
        System.out.println(x); //10
        System.out.println(y);  //11111


    }

    public static void fun(int x, Integer y) {
        x++;
        y++;

        System.out.println(x);//11
        System.out.println(y);//12


    }
}
/*What are Autoboxing and Unboxing?
Autoboxing:
The automatic conversion of a primitive type (e.g., int) to its corresponding wrapper class (Integer).
Example: Assigning int x = 10 to an Integer object automatically converts int to Integer.

Unboxing:
The automatic conversion of a wrapper class (e.g., Integer) to its corresponding primitive type (int).
Example: Using an Integer object where an int is expected will automatically convert Integer to int.

*
* */

