package Gun30._03_Soru;

public class Sabitler {

    final  static  int birGundekiSaatSayisi=24;
    final  static  int birSaattekiDakikaSayisi=60;
    final  static  int birDakikadakiSaniyeSayısı=60;


    public static int hesap(int gun, int saat, int dakika) {

        int toplamSaniye=
         gun
                 *Sabitler.birGundekiSaatSayisi
                 *Sabitler.birSaattekiDakikaSayisi
                 *Sabitler.birDakikadakiSaniyeSayısı
                 +
         saat
                 *Sabitler.birSaattekiDakikaSayisi
                 *Sabitler.birDakikadakiSaniyeSayısı
                 +
         dakika
                 *birDakikadakiSaniyeSayısı;
       return toplamSaniye;
    }



}
