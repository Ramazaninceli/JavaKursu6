package TekrarDersler;

import java.util.Scanner;

public class _04_ifElseSwitch {
    public static void main(String[] args) {
        int sayi1=5;
        int sayi2=5;

        boolean esitMi=sayi1==sayi2;
        System.out.println("esitMi = " + esitMi);

        if (sayi1==sayi2)
            System.out.println(" eşit");
        else
            System.out.println(" değil");

        String sifre1="Merhaba";
        String sifre2="Merhabalar";

        if (sifre1.equals(sifre2))// string ifadeler bu şekilde karşılaştırılır.
            System.out.println("Hoşgeldiniz");
        else
            System.out.println("Hatalı şifre");

        //kullanıcıdan alınan gün no ya göre adını yazınız.
Scanner oku=new Scanner(System.in);
        System.out.println("Gun no giriniz:");
        int gunNo= oku.nextInt();

        switch (gunNo){
            case 1 : System.out.println("Pazartesi"); break;
            case 2 : System.out.println("Salı"); break;
            case 3 : System.out.println("Çarşamba"); break;
            case 4 : System.out.println("Perşembe"); break;
            case 5 : System.out.println("Cuma"); break;
            case 6 : System.out.println("Cumartesi"); break;
            case 7 : System.out.println("pazar"); break;
            default:
                System.out.println("hatalı rakam girildi");

        }

    }
}
