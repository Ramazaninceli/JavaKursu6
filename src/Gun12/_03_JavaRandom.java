package Gun12;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {
        // (int (Math.Random()*10)  -> 0-9 arası üretir.
        // 20-30 arası ramdom sayı? min birde max lazım, alt sınır ve üst sınır lazım
        // Girilen min-max aralığında random sayı üreten programı yazınız.
//
//        Scanner oku= new Scanner(System.in);
//
//        System.out.print("min (alt) sınır :");
//        int min= oku.nextInt();
//
//        System.out.print("max (üst) sınır :");
//        int max= oku.nextInt();
//
//        int rndSayi= (int) (Math.random()*(max-min))+min;
//        System.out.println("rndSayi = " + rndSayi);

        Scanner oku=new Scanner(System.in);

        System.out.print("Min (alt) sayi gir : ");
        int mini= oku.nextInt();

        System.out.print("Max (üst) sayı giriniz : ");
        int maxi= oku.nextInt();

        int rndSayi= (int) (Math.random()*(maxi-mini))+ mini;
        System.out.println("rndSayi = " + rndSayi);







    }
}
