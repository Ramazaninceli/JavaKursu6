package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //Bir öğretmenden girmek istediği kadar notu alınız.
        //Öğretmene devam etmek istiyormusunuz(e/H) şeklinde sorunuz
        //ve ortalamayı geçen öğrenci sayısını bulunuz.
       // do {
//        not giriniz=
//                60 girdim
//                devam etmek istiyormusunuz
//
   // }while (e ise başa dönecek)
        //ortalamayı kaç öğrenci geçmiş onu bulacağız.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Integer> notlar=new ArrayList<>();
        double toplam=0;
        String cevap="";
        do {
            System.out.print("Not giriniz :");
            int not= okuInt.nextInt();
            notlar.add(not);
            toplam+=not;
            System.out.print("Devam etmek istiyor musunuz (E/H):");
            cevap=okuStr.next();
        }while (cevap.equalsIgnoreCase("E"));// döngünün devam şartı yazılıyor
        //öğretmenin istediği kadar notlar girildi

        //ortalama bulundu
        double ort=toplam/notlar.size();// ortalamayı bulmak için
        int gecenSayisi=0; //geçen sayısı bulundu
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>=ort)
                gecenSayisi++;


        }
        System.out.println("gecenSayisi = " + gecenSayisi);








           /********************/
           //2. yol
//        double toplamNot = 0;
//        int sinavSayisi = 0;
//        int gecenSayisi = 0;
//
//        String devam = "e";
//
//        while (devam.equals("e")) {
//            System.out.print("Notunuzu girin: ");
//            double not = input.nextDouble();
//
//            toplamNot += not;
//            sinavSayisi++;
//
//            System.out.print("Devam etmek istiyor musunuz? (e/H): ");
//            devam = input.next();
//        }
//
//        double ortalama = toplamNot / sinavSayisi;
//        System.out.println("Ortalama: " + ortalama);
//
//        for (int i = 1; i <= sinavSayisi; i++) {
//            System.out.print("Öğrenci " + i + " notu: ");
//            double not = input.nextDouble();
//
//            if (not >= ortalama) {
//                gecenSayisi++;
//            }
//        }
//
//        System.out.println("Ortalamayı geçen öğrenci sayısı: " + gecenSayisi);
    }


        }

