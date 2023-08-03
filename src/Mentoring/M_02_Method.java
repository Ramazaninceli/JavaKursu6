package Mentoring;

public class M_02_Method {
    public static void main(String[] args) {

        int[] dizi=new int[5];

        //dizi elemanlarını ekleyen metod çağrısı
        diziElemanEkle(dizi);


        // dizi elemanlarını ekrana yazdıran metot çağrısı

        diziYazdir(dizi);


        // dizi elemanları taplamını hesaplayan metod
       int toplam= diziToplam(dizi);
        System.out.println("toplam = " + toplam);

        // dizi elemanları ortalama hesaplayan metod

       double ortalama= diziOrtalama(dizi);

        System.out.println("ortalama = " + ortalama);
        // dizi elemanları en büyük elemanı hesaplayan metod

       int enBuyuk= diziEnBuyukEleman(dizi);
        System.out.println("enBuyuk = " + enBuyuk);
    }

    // diziye random eleman ekleyen metod
    public static void diziElemanEkle(int[] dz){
        for (int i = 0; i < dz.length; i++) {
            dz[i]=(int)(Math.random()*(100+1));
        }



    }

    public static void diziYazdir(int[] dz){
        for (int eleman: dz ) {
            System.out.print(+ eleman+ " ");

        }
        System.out.println();

    }
    public static int diziToplam(int[] dz) {
        int toplam = 0;
        for (int eleman : dz) {
            toplam += eleman;
        }
        return toplam;
    }


    public static double diziOrtalama(int[] dz){
        int toplam=diziToplam(dz);
    double ortalama=(double) toplam/dz.length;

    return ortalama;

    }

    public static int diziEnBuyukEleman(int[] dz){

        int enBuyuk= dz[0];
        for (int i = 0; i < dz.length; i++) {
            if (dz[i]>enBuyuk);{
                enBuyuk=dz[i];
            }
            return enBuyuk;

        }


        return enBuyuk;
    }

}
