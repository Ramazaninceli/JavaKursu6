package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {
        // Soru: Girilen bir sayının sıfır mı, negatif mi , pozitip mi
        // olduğunu ternary operatör ile yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = oku.nextInt();

        //1. yöntem
        String sayiStr=(sayi<0) ? "negetif" : (sayi==0) ? "sıfır" : "pozitif";
        System.out.println("sayi = " + sayiStr);
        //2 . yöntem
        System.out.println((sayi<0) ? "negetif" : (sayi==0) ? "sıfır" : "pozitif");






    }
}
