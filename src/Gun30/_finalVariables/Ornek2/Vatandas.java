package Gun30._finalVariables.Ornek2;

public class Vatandas {
   final int TcNo;
    String isim;
    String adres;

    private static  int TcNosayac=1;

    public Vatandas(String isim, String adres) {
        this.TcNo = TcNosayac++;
        this.isim = isim;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "TcNo=" + TcNo +
                ", isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
