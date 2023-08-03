package Gun28._04_Ornek;

public class Banka {

    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka() {
    }

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
        //this(adi,subeSayisi,kurulusYili); bu şekilde de olabilir
    }

    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;

       // this(adi,subeSayisi,0); bu şeklide de olabilir
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
