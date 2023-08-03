package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //girilen 2 sayıdan büyük olanın değerini ekrana yazdırınız
        // eşit ise eşit yazdırınız.

        Scanner gir=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        int sayi1= gir.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int sayi2= gir.nextInt();


        if (sayi1>sayi2)
            System.out.println("büyük olan sayı1 :" +sayi1);

        if (sayi1<sayi2)
            System.out.println("büyük olan sayı2 : " +sayi2);
        if (sayi1==sayi2)
            System.out.println("sayılar eşittir");


    }
}
