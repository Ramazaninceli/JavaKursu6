package Gun39._03_Soru;

public class Kartal extends Hayvan{


    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("et yer");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");

    }

    @Override
    void sesi() {
        System.out.println("ciyak vuhuuuuuu");

    }

    @Override
    void yemekMiktari() {
        System.out.println("100 gr");
    }
}
