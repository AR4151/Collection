package java8;

import java.util.function.Supplier;

public class Suplier {

    public static void main(String[] args) {
        Supplier<String> otp = ()->{
            String Otp = "";
            for(int i=1;i<7;i++){
                Otp = Otp+ (int) (Math.random() * 10); // --> Math.random() generates random number from 0 to 1 (i.e, 0 to 0.999)
            }

            return Otp;
        };
        System.out.println("OTP is: "+otp.get());
        System.out.println("OTP is: "+otp.get());
        System.out.println("OTP is: "+otp.get());
        System.out.println("OTP is: "+otp.get());


    }
}
