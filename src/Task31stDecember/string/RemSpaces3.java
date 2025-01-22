package Task31stDecember.string;

// Q1-> 3) How do you remove all white spaces from a string in Java?
public class RemSpaces3 {

    public static void removeSpaces(String name){
        String s1 = name.trim();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=32){
                sb.append(s1.charAt(i));
            }
        }
        System.out.println("The String without white spaces: "+sb);

    }
    public static void main(String[] args) {
        removeSpaces("  Roshan Deepak Alte  ");
        removeSpaces("   Shymala high schoole udgir");


    }
}
