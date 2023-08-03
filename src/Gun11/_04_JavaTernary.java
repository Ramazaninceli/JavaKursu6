package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1, değilse o değirini
        // ekrana yazdırınız. terhary operatör ile yapınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz =");
        int sayi= oku.nextInt();

        //1. yol
        int sonuc=(sayi>50) ? 1 : 0;//Ternary Metodu
        System.out.println("sonuç :" +sonuc);

        //2. yol
        System.out.println((sayi>50) ? 1 : 0);//Ternary Metodu
    }
}
