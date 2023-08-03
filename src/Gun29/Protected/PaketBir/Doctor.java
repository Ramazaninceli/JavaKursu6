package Gun29.Protected.PaketBir;

public class Doctor {
   public String hastaneAd; // public: diğer paketlerden erişim izni verildi.
    String adi;             //default
   protected String bolumu; //default gibi
   private String sicilNo; // private : sadece classın içinden erişilebilir.

     Doctor() {// sadece kendi paketindekiler erişilebilir.
    }

    public Doctor(String adi) {
        this.adi = adi;
    }
}
