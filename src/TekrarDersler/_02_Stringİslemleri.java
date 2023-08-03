package TekrarDersler;

import java.util.Scanner;

public class _02_Stringİslemleri {
    public static void main(String[] args) {
        //            01234567890123456
        String cumle="Bu gün hava güzel";//indeşx oda numaraks
        System.out.println("cumle.length() = " + cumle.length());
        System.out.println("cumlechart(1) = " + cumle.charAt(1));//u
        System.out.println("cumle.indexOf(\"u\") = " + cumle.indexOf("u"));//1
        System.out.println("cumle.contains(\"u\") = " + cumle.contains("u"));//true// varMı yokMu

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifre :");
        String sifre= oku.next();

        System.out.print("Şifre Tekrar:");
        String sifreTekrar= oku.next();
        boolean esitMi=sifre.trim().equals(sifreTekrar);// sifre  , tekrarSifreye eşit mi// trim başta ve sonda olan boşluğu siler
        System.out.println("esitMi = " + esitMi);

    // oku.next boşluğa kadar okur
        //oku.nextline ise :tüm satırı okur

        sifre="Merhaba";

        sifre.toLowerCase().contains("n");//

        String aranan1="m" ;
        String aranan2="M";

        Boolean varMi=sifre.toLowerCase().contains(aranan1.toLowerCase());
        System.out.println("varMi 1= " + varMi);

       varMi=sifre.toLowerCase().contains(aranan1.toLowerCase());
        System.out.println("varMi 1= " + varMi);


    }
}
