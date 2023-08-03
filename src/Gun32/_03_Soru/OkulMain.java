package Gun32._03_Soru;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

       Okul okul=new Okul("kabataş okulu",3);

       do {
           System.out.print("Öğrenci adı: "); String ad=okuStr.nextLine();
           System.out.print("Öğrenci Soyadı: "); String soyad=okuStr.nextLine();
           System.out.print("Öğrenci yaşı: "); int yas=okuInt.nextInt();
           if (yas<15) {
               Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                okul.getOgrencileri().add(ogr);
                 }else
               System.out.println("Öğrenci yaşı bu okul için uygun değil");


       }while (okul.ogrencileri.size()<okul.getKontenjan());

        System.out.println("okul.getOgrencileri() = " + okul.getOgrencileri());
    }
}
