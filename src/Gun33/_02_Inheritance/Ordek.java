package Gun33._02_Inheritance;

public class Ordek extends Hayvan {
    private int kanatAcikligi;
    public Ordek(String renk, int kilo, String cinsi,int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vag vag");
    }

    @Override
    public String toString() {
        return super.toString()+", kanat açıklığı "+this.kanatAcikligi +'\'';
    }
}
