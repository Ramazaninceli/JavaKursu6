package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    //kullanıcıya oğrence misiniz şeklinde sorunuz.
    // evet ise trae değil ise false cavabını veriniz.
    //ve alınan cavabı yazdırınız.
    public static void main(String[]args){

    Scanner oku = new Scanner(System.in);
        System.out.print("Öğrenci misiniz : ");// True veya False
        boolean cevap = oku.nextBoolean();

        System.out.println("cevap = " + cevap);

        // = -> tek eşittir değer atamak için kullanılır,
        //== -> çift eşittir ise şartlı ise de kullanılır.


}
}