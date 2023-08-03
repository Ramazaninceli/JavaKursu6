package Gun32._03_Soru;

import java.util.ArrayList;

public class Okul {
 private   String okulAd;
 private   int kontenjan;

    ArrayList <Ogrenci> ogrencileri=new ArrayList<>();

    public Okul(String okulAd, int kontenjan) {
        this.okulAd = okulAd;
        this.kontenjan = kontenjan;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogrencileri=" + ogrencileri +
                '}';
    }
}
