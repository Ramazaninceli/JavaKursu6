package Gun12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        //kullanıcı bilirse tebrikler yazdırnız
        // 5 girersem 5 e kadar sayı üretsin, ben tahmin etmeye çalıyım,

//        Scanner oku=new Scanner(System.in);
//        System.out.print("Üretilecek sayı sınırı : ");
//        int sinir = oku.nextInt();
//
//        int tutulanSayi=(int)(Math.random()*sinir);// bilgisayarın ürettiği sayı
//
//        System.out.print("Tahmininizi girin : ");//6 -> 0,1,2,3,4,5
//        int sayiTahmin = oku.nextInt();
//
//        if (tutulanSayi==sayiTahmin)
//            System.out.println("Tebrikler");
//        else
//            System.out.println("Bilemediniz : " +tutulanSayi);


        Scanner oku=new Scanner(System.in);
        System.out.print("sınır sayı giriniz : ");
        int sinir= oku.nextInt();

        int tutulanSayi= (int) (Math.random()*sinir);

        System.out.print("Tahmininizi giriniz : ");
        int tahmin= oku.nextInt();

        if (tutulanSayi==tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedin ki : " + tutulanSayi);

    }
}
