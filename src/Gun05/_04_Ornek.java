package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {

        // kullanıcıdan Adını ve soyadını ayrı yarı okutarak alıp birlikte ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Adınızı giriniz :");
        String ad = oku.nextLine();

        System.out.print("Soyadınızı giriniz :");
        String soyAd=oku.nextLine();

        System.out.println("Adınız ve Soyadınız = " + ad +" " +soyAd);
    }
}
