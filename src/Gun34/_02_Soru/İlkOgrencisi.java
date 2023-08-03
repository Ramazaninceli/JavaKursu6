package Gun34._02_Soru;

public class İlkOgrencisi extends Ogrenci{
    private static int sayac=1;
    private String klup;
        public İlkOgrencisi(String isim, String klup) {
        super(isim, OgrTip.İlk,sayac++);
        setKlup(klup);


    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return super.toString()+",  Klüp :" +klup;
    }
}
