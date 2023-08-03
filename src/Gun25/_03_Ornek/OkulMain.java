package Gun25._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner inputInt=new Scanner(System.in);
        Scanner inputStr=new Scanner(System.in);

        ArrayList<OgrenciKayit> ogrenciler=new ArrayList<>();


        for (int i = 0; i < 3; i++) {

            OgrenciKayit ogr=new OgrenciKayit();

            System.out.print("öğrenci Adı :");
            ogr.adi=inputStr.nextLine();

            System.out.print("öğrenci Soyadı :");
            ogr.soyadi=inputStr.nextLine();

            System.out.print("öğrenci Adresi :");
            ogr.adres=inputStr.nextLine();

            System.out.print("öğrenci sınıfı :");
            ogr.sinifi=inputInt.nextInt();


            ogrenciler.add(ogr);
        }

        for (OgrenciKayit o:ogrenciler  ) {

            System.out.println("o.adi = " + o.adi);
            System.out.println("o.soyadi = " + o.soyadi);
            System.out.println("o.sinifi = " + o.sinifi);
            System.out.println("o.adres = " + o.adres);


        }





    }
}
