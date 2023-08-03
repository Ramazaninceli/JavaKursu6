package Gun35._02_PolyMorphizm._Soru;

public class Okul {
    public static void main(String[] args) {

        Calisan cal =new Calisan("ramazan","ince","planlama","uretim");
        Ogrenci ogr =new Ogrenci("Miraç","ince","öğrenci","2/b");


        Kisi.kimlikBelgesiYazdir(ogr);
        Kisi.kimlikBelgesiYazdir(cal);


    }


}
