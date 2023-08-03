package Gun39._03_Soru;

public class Kedi extends Hayvan{


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("kedi mama ve balık yer");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("16 saat");

    }

    @Override
    void sesi() {

        System.out.println("miyav");

    }

    @Override
    void yemekMiktari() {
        System.out.println("50 gr");
    }
}
