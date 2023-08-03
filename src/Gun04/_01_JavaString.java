package Gun04;

public class _01_JavaString {
    public static void main(String[] args) {

        int sayac=0; // int tipi, sayac adı, 0 başlangıç değeri

        String ad="Ramazan"; // kelime veya kelimeler saklayacaksan String kullanılacak

        System.out.println("sayac = " + sayac); // 0 yazar
        System.out.println("ad = " + ad);
        String soyad="ince";
        String tamAd= ad+ " " + soyad; // + işareti sayılarda toplar, kelimelerde yan yana birleştirir.
        System.out.println("tamAd = " + tamAd);//Ramazan İnce yazar

    }
}
