package Gun33._03_Soru;

public class GenelMudur extends Calisan{
    private double tazminat;
    public GenelMudur(String isim, double maas, double maasKatSayisi,double tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);

    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+this.tazminat;


    }

    @Override
    public String toString() {
       // return super.toString()+" tazminat"+this.tazminat;
        return "Bodro" +
                "\nisim='" + this.getIsim() + '\'' +
                "\n maas=" + this.getMaas() +
                "\n maasKatSayisi=" + this.getMaasKatSayisi() +
                "\n Tazminat=" + this.getTazminat() +
                "\n ödenecek Maaş :"+maasHesapla();

    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        //eğer kademesi ise tazminatın yarısı alır.
        if (tazminat>0)
        this.tazminat = tazminat;
    }


}
