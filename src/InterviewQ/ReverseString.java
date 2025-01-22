package InterviewQ;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println("Result: ");
        System.out.println(reverseString(s));
    }
    public static String reverseString(String input){
        Stack<Character> stk = new Stack<>();

        for(Character c : input.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                stk.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(Character c : input.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(stk.pop());
            }
            else{
                sb.append(c);
            }
        }
        return sb+"";

    }
}
