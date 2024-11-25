package InterviewQ;


class Super {
    public Super() {
        OverrideMe();
    }

    public void OverrideMe() {
        System.out.println("Super");
    }
}
class Sub extends Super{
    @Override
    public void OverrideMe(){
        System.out.println("Sub");
    }
}

public class Cons {
    public static void main(String[] args) {
        Super ss = new Sub();
        //Super ss = new Super();
        ss.OverrideMe();
        //Sub ss1 = (Sub) new Super(); --> down Casting is not supported in Java.
    }



}

/* Key Points to Remember
Dynamic Method Dispatch:

# Method calls in Java are resolved at runtime based on the actual object type, not the reference type.
Even though the Super constructor calls OverrideMe(), the version in the subclass (Sub) is executed because the object is of type Sub.
Constructor Execution Order:

# The superclass constructor is always executed first before the subclass constructor.
However, calling overridden methods during the superclass constructor is dangerous because the subclass's fields may not yet be initialized
*
* */
