package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir kelime gir : ");
        String cumle=oku.nextLine();

        // 1. yol
         int uzunluk=cumle.length()-1;
        char sonHarf=cumle.charAt(uzunluk);
        System.out.println("sonHarf = " + sonHarf);

        // 2. yöntem
         char sonHarf1 = cumle.charAt(cumle.length()-1); // uzunluğun bir eksiği son karakteri harfi verir
        System.out.println("Son Harf1 = " + sonHarf1);

    }
}
