public class ReverseNumber {
    public void RevNum(int a) {
        StringBuffer s = new StringBuffer(String.valueOf(a));
        StringBuffer rev = new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));

        }
        System.out.println("The reversed number is "+rev);
    }

    public static void main(String[] args) {
        ReverseNumber rr = new ReverseNumber();
        rr.RevNum(54321);
        rr.RevNum(987654321);
    }
}
