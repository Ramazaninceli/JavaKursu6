package SerbestCalisma_27062023;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1001;
        ogr.adi="Ramazan";
        ogr.soyadi="İnce";

      ogr.ogrOkul=new Okul();
      ogr.ogrOkul.okulAdi="Keles İHL";
      ogr.ogrOkul.mudurAdi="Ali Bozyel";
      ogr.ogrOkul.okulAdresi="Keles/Bursa";


        System.out.println("ogr = " + ogr.okulNo);
        System.out.println("ogr = " + ogr.ogrOkul.okulAdresi);


    }
}
