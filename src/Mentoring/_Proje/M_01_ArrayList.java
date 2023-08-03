package Mentoring._Proje;

import java.util.ArrayList;
import java.util.Scanner;

public class M_01_ArrayList {

    private static ArrayList<String> urunler =new ArrayList<>();
    private static ArrayList<Integer> miktarlar =new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        boolean devam=true;
        while (true){
            System.out.println("1. Ürün ekle");
            System.out.println("2. Stok miktarını güncelle");
            System.out.println("3. Ürünleri listele");
            System.out.println("0. Çıkış");
            System.out.print("Tercih giriniz:");

          int secim= scanner.nextInt();
            switch (secim){

                case 1:urunEkle(scanner);

                    break;
                case 2: stokMiktariGuncelle(scanner);
                    break;
                case 3:urunleriListele();
                    break;
                case 0:
                    System.out.println("çıkış yapılıyor..");
//                    devam=false;
//                    break;
                    return;
                default:

            }


        }



    }

    public static void urunEkle(Scanner scanner){
        System.out.print("Ürün adını giriniz: ");
        String urunAdi= scanner.next();
        System.out.print("Stok miktarı giriniz: ");
        int miktar=scanner.nextInt();

        urunler.add(urunAdi);
        miktarlar.add(miktar);
        System.out.println("ürün başarıyla eklendi.");



    }

    public  static void stokMiktariGuncelle(Scanner scanner){

        System.out.print("Güncellemek istediğiniz ürün adını girin:");
        String urunAdi= scanner.next();

        int indeks=urunler.indexOf(urunAdi);
        if (indeks!=-1){
            System.out.print("Güncel stok miktarını giriniz: ");
            int yeniMiktar=scanner.nextInt();
            miktarlar.set(indeks,yeniMiktar);
            System.out.println("stok miktarı güncellendi");
        }else
            System.out.println("ürün bulunamadı.");


    }

    public static void urunleriListele(){

        if (urunler.size()==0){
            System.out.println("stokta ürün bulunmamaktadır.");
        }else {
            System.out.println("Ürünler ve stok miktarları: ");

            for (int i = 0; i <urunler.size() ; i++) {
                System.out.println(urunler.get(i)+" "+miktarlar.get(i));

            }
        }
    }

}
