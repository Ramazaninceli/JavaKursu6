package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci();

        ogr1.okulNo=1001;
        ogr1.ad="Hakan";
        ogr1.soyAd="kiliç";
      //  ogr1.okulAdi="Bayrak okulu";

        ogr1.ogrOkul=new okul();
        ogr1.ogrOkul.okulAd="Bayrak okulu";
        ogr1.ogrOkul.mudurAd="Selim Ozel";
        ogr1.ogrOkul.adres="ümraniye / ist";

        System.out.println("ogr1 = " + ogr1.ad);
        System.out.println("ogr1.ogrOkul.mudurAd = " + ogr1.ogrOkul.mudurAd);



    }
}
