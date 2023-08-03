package Gun27.Ornek3Tekrar;

public class Univ {
    public static void main(String[] args) {

        Ogrenci.Kurallar();

        Ders ders1=new Ders();
        Ders ders2=new Ders();
        Ders ders3=new Ders();

        ders1.name="Algoritma";
        ders1.saat=6;
        ders2.name="java";
        ders2.saat=6;
        ders3.name="test tool";
        ders3.saat=8;

        Ogrenci ogr=new Ogrenci();
        ogr.name="Ramazan";
        ogr.maxSaat=20;

        ogr.dersleri.add(ders1);
        ogr.dersleri.add(ders2);
        ogr.dersleri.add(ders3);

        ogr.dersYazdir();





    }
}
