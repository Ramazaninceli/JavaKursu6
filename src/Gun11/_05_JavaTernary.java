package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //otopark üçretleri:(ternary operatörü ile yapınız)
        //3 saate kadar 10tl , 5 saate kadar 15 tl, saat 5 den fazla ise 20 tl  dir.
        //kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("saat giriniz :");
        int saat= oku.nextInt();

        //1. yöntem
        System.out.println( (saat<=3) ? "10 tl" : (saat>3 && saat<=5) ? "15 tl" : "20 tl");

        //2. yöntem
        System.out.println( (saat<=3) ? "10 tl" : (saat<=5) ? "15 tl" : "20 tl");

        //3. yöntem

        String ucret=(saat<=3) ? "10 tl" : (saat<=5) ? "15 tl" : "20 tl";
        System.out.println("ucret = " + ucret);
    }
}
