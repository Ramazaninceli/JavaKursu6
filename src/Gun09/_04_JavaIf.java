package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız
        //tek veya çift şeklinde yazdırınız

        Scanner gir = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = gir.nextInt();

        if (sayi%2==0)
            System.out.println("sayı çifttir");

        if (sayi%2!=0)
            System.out.println("sayı tektir");

    }
}
