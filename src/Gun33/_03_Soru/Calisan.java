package Gun33._03_Soru;

public class Calisan {
   private String isim;
   private double maas;
   private double maasKatSayisi;

    public double maasHesapla(){
      return this.maas*this.maasKatSayisi;
    }

    public Calisan(String isim, double maas, double maasKatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    @Override
    public String toString() {
        return "Bodro" +
                "\nisim='" + isim + '\'' +
                "\n maas=" + maas +
                "\n maasKatSayisi=" + maasKatSayisi +
                "\n ödenecek Maaş :"+maasHesapla();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(double maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }
}
