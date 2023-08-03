package Gun10;

import java.util.Scanner;

public class _00_JavaIf {
    public static void main(String[] args) {
        //kullanıcının 2 kez gireceği şifresinin aynı olduğunda
        //AYNI veya DEĞİL şeklinde ceaplayınız (Confirm new password)

        Scanner oku =new Scanner(System.in);

        System.out.print("1. şifreyi giriniz :");
        String sifre1= oku.nextLine();//merhaba 78. odada

        System.out.print("2. şifreyi giriniz :");
        String sifre2= oku.nextLine();//merhaba // 88. odada olsun

        // String karşılaştırmalarda === kullanılmaz
        //String karşılaştırmalarda equals kullanılmalı dikkat et ramazan
        // bu formül kullanılmaz
        if (sifre1==sifre2)// Stringlerde hafızadaki yerlerini kontrol eder
            System.out.println("AYNI==");
        if (sifre1!=sifre2)
            System.out.println("DEĞİL==");

        //olması gereken String ifadelerde bu iş için yapılmış olan içerik karşılatırıcı Equals kullanılmalı
        // en doğrusu aşağıda gibi

        if (sifre1.equals(sifre2)==true)
            System.out.println("AYNI");
        if (sifre1.equals(sifre2)==false)
            System.out.println("DEĞİL");

        // en doğrusu

        if (sifre1.equals(sifre2))
            System.out.println("AYNI");
        if (!sifre1.equals(sifre2))
            System.out.println("DEĞİL");

    }
}
