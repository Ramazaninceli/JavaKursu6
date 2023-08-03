package Gun25.Odev_2;

import Gun25._04_Ornek.ArabaKayit;

import java.util.ArrayList;
import java.util.Scanner;

public class OgretmenMain {
    public static void main(String[] args) {


        Scanner okuInt = new Scanner(System.in);
        Scanner okustr = new Scanner(System.in);

        ArrayList<OgrenciKayit> kayits = new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            OgrenciKayit a = new OgrenciKayit();

            System.out.print("Okul no giriniz: ");
            a.okulNo = okuInt.nextInt();

            System.out.print("Tam ad giriniz: ");
            a.tamAdi = okustr.nextLine();

            System.out.print("Ders notu giriniz: ");
            a.notu = okuInt.nextInt();

            kayits.add(a);
        }
        OgrenciYazdir(kayits);
        notOrtalamasiYazdir(kayits);

        }
        public static void OgrenciYazdir( ArrayList<OgrenciKayit> kayits){

            for (OgrenciKayit a:kayits){
                System.out.println("okul no + tam adı + notu = " + a.okulNo+" "+a.tamAdi+" "+a.notu);
            }

        }
        public static void notOrtalamasiYazdir(ArrayList<OgrenciKayit> kayits){

            int toplam=0;
            for (OgrenciKayit a:kayits)
                toplam=toplam+a.notu;

            int ort=toplam/ kayits.size();
            System.out.println("ort = " + ort);

        }



    }
