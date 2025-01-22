package Task31stDecember.string;
//Q1-> 1) How to reverse a string in Java?
public class ReverseString1 {
    public static StringBuilder reverseString(String name){
        StringBuilder reverse= new StringBuilder("");
        for(int i=name.length()-1;i>=0;i--){
            reverse.append(name.charAt(i));
        }
        //System.out.println(reverse);
        return  reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Roshan"));
        String n = "Java";


    }
}
