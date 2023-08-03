package TekrarDersler;

import java.util.Scanner;

public class _01_GenelGirisKonulari {
    public static void main(String[] args) {
        System.out.println("Merhaba dünya");//out ekrana yaz
        // ln yazdıktan sonra bir alt satıra geç demek
        System.out.print("merhaba\t");

        System.out.println("dünya");

        int sayi=5; // int yani tam sayı saklayacak
        String cumle="Bugün ek çalışma "; // kelime veya cümle saklayabilirim

        //double, char, long, byte, short, float,
        double ortalam=30.5;

        ortalam=sayi;//küçük bir alanı büyük alana atıyorsun bir problem yok double int e göre büyük alandır.
        //sayi=ortalam; // büyük alanı küçük alana atıyorsun dikkat veri kaybı olabilir. int i doubleye
        sayi=(int) ortalam; // illada yapacaksan bu şekilde yap ama yine de veri kaybı olabilir

        //kullanıcıdan veri nasıl alınır.

        Scanner oku=new Scanner(System.in); // okuyucu
        System.out.print("sayı giriniz :");
        int okunanSayi=oku.nextInt();//ekrandan sayı oku sayı olarak ver

        Scanner okuStr=new Scanner(System.in);
        System.out.print("cumle : ");
        String okunanCumle=okuStr.nextLine();
        System.out.println("okunanCumle = " + okunanCumle);


    }
}
