package Gun05;

import java.util.Scanner;

public class _ScannerOdev10 {
    public static void main(String[] args) {
        //10- Kullanıcıdan alacağının 2 sayının 4 işlemini ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        int sayi1= oku.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int sayi2 = oku.nextInt();

        int toplam= sayi1+sayi2;
        int cikarma= sayi1-sayi2;
        int carpma= sayi1*sayi2;
        double bolme=sayi1/(double)sayi2;

        System.out.println("toplam = " + toplam);
        System.out.println("cikarma = " + cikarma);
        System.out.println("carpma = " + carpma);
        System.out.println("bolme = " + bolme);
    }
}
