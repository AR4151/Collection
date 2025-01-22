public class P {
    int a = 10;
}
class A extends P{
    int a=5;
}
class C extends A{
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a);
    }
}
