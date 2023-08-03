package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println(" sayi= " );
        int sayi= oku.nextInt();

        if (sayi%2==0)
            System.out.println("Çift");
        else
            System.out.println("tek");

        //1. kısa yöntem
        String sonuc=(sayi%2==0) ? "çift" : "Tek";// ?-> if , :-> else
        System.out.println("sonuc = " + sonuc);

        // 2. yöntem
        System.out.println((sayi%2==0) ? "çift" : "tek");



    }
}
