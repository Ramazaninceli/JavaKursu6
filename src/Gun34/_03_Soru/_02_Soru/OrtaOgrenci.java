package Gun34._03_Soru._02_Soru;

public class OrtaOgrenci extends Ogrenci {
    private static int sayac=1;
    public OrtaOgrenci(int id, String isim, OgrTip tipi) {
        super(isim, tipi,sayac++);
    }


}
