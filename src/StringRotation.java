import java.util.Arrays;

public class StringRotation {

    public static boolean isRotation(String original, String rotated) {
        if (original.length() != rotated.length()) {
            return false;
        }


        char[] originalArr = original.toCharArray();
        char[] rotatedArr = rotated.toCharArray();

        Arrays.sort(originalArr);
        Arrays.sort(rotatedArr);

        return Arrays.equals(originalArr, rotatedArr);
    }

    public static void main(String[] args) {
        String original = "JavaJ2eeStrutsHibernate";
        String rotated = "J2eeJavaStrutsHibernate";
        String rotated1 = "JavaStrutsHibernateJ2ee";

        if (isRotation(original, rotated)) {
            System.out.println(rotated + " is a rotation of " + original);
        } else {
            System.out.println(rotated + " is NOT a rotation of " + original);
        }

        if (isRotation(original, rotated1)) {
            System.out.println(rotated + " is a rotation of " + original);
        } else {
            System.out.println(rotated + " is NOT a rotation of " + original);
        }
    }
}
