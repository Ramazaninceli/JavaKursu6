package Gun30._StaticVariablesOrnek1.Ornek01;

public class Ogrenci {
    String ad;
    String soyad;

      static String okulAd="Yıldırım ilkokulu";
    //kod adi: sen bitanesin,
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar.
    // hepsine atanır, tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu


    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "\nad='" + ad + '\'' +
                ",\n soyad='" + soyad + '\'' +
                ",\n okulAd='" + okulAd + '\'' +
                '}';
    }
}
