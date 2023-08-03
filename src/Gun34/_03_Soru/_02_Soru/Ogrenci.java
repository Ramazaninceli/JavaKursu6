package Gun34._03_Soru._02_Soru;

public class Ogrenci {
  private int Id;
  private static int sayac=1;
  private String isim;
  private OgrTip tipi;

    public Ogrenci(String isim, OgrTip tipi, int id) {

        setIsim(isim);
        setTipi(tipi);
        setId(sayac++);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return
                "Id=" + Id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi
                ;
    }
}
