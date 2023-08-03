package Gun34._02_Soru;

public class LiseOgrencisi extends Ogrenci{

    private static int sayac=1;
    private String brans;
    public LiseOgrencisi( String isim, String brans) {
        super(isim, OgrTip.Lise,sayac++);
        setBrans(brans);

    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Branş = " +brans;
    }
}
