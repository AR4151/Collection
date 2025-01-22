package InterviewQ;

public class Main {
    public Main() {
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("Super");
    }

}

class Subb extends Main {

    @Override
    public void overrideMe() {
        System.out.println("sub");
    }

    public static void main(String[] args) {
        Main sub = new Subb();
        Main sub1 = new Main();
        sub.overrideMe();
        sub1.overrideMe();

    }
}
