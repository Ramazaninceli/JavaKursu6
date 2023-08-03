package Proje;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Proje {
    public static void main(String[] args) {

        String[] urunler = {"Yumurta", "Sut", "Kirmizi Et", "Sivi Yag"};
        double[] fiyat = {2.50, 30.50, 500.0, 80.50};
        int[] stoklar = {55, 40, 5, 12};
        double toplam = 0;
        int fark = 0;

        Scanner urunStr = new Scanner(System.in);
        Scanner miktarInt = new Scanner(System.in);


        for (int i = 0; i < urunler.length; i++) {
        }
        System.out.println("Urunlerimiz = " + Arrays.toString(urunler));
        for (int i = 0; i < fiyat.length; i++) {
        }
        System.out.println("Fiyatlar    = " + Arrays.toString(fiyat));
        for (int i = 0; i < stoklar.length; i++) {
        }
        System.out.println("Stok Durumu = " + Arrays.toString(stoklar));

        System.out.print("Almak istediginiz urunun adini yaziniz = ");
        String alinacakUrun = urunStr.nextLine();
        System.out.print("Almak istediginiz miktari yaziniz = ");
        int urunMiktari = miktarInt.nextInt();

        if ((alinacakUrun.equalsIgnoreCase(urunler[0])) && (urunMiktari <= stoklar[0])) {
            toplam = (fiyat[0] * urunMiktari);
            System.out.println("Alis veris toplam ucretiniz = " + toplam);

        } else {
            fark = urunMiktari - stoklar[0];
            System.out.println("Sectiginiz urunun stoklari mevcut degil");
            System.out.println("Eksik urun miktari = " + fark);
            toplam = stoklar[0] * fiyat[0];
            System.out.println("Alis veris toplam ucretiniz = " + toplam);
        }
    }
}

