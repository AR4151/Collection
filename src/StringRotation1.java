import java.util.stream.IntStream;

public class StringRotation1 {

    public static boolean isRotation(String original, String rotated) {

        if (original.length() != rotated.length()) {
            return false;
        }

        String concatenated = original + original;
        return IntStream.range(0, concatenated.length() - rotated.length() + 1)
                .mapToObj(i -> concatenated.substring(i, i + rotated.length()))
                .anyMatch(sub -> sub.equals(rotated));
    }

    public static void main(String[] args) {
        String original = "JavaJ2eeStrutsHibernate";
        String rotated1 = "StrutsHibernateJavaJ2ee";
        String rotated2 = "J2eeStrutsHibernateJava";
        String rotated3 = "HibernateJavaJ2eeStruts";
        String notRotated = "JavaStrutsJ2eeHibernate";


        System.out.println(rotated1 + " is rotation: " + isRotation(original, rotated1));
        System.out.println(rotated2 + " is rotation: " + isRotation(original, rotated2));
        System.out.println(rotated3 + " is rotation: " + isRotation(original, rotated3));
        System.out.println(notRotated + " is rotation: " + isRotation(original, notRotated));
    }
}
