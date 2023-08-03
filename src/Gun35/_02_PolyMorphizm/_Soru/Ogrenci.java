package Gun35._02_PolyMorphizm._Soru;

public class Ogrenci extends Kisi {

    private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi, String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

   }
