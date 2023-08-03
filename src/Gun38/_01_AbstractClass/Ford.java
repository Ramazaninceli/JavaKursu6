package Gun38._01_AbstractClass;

//nesne üretilecek class
public class Ford extends BinekOto {
    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    public int hizlanmaSuresi() {
        return 0;
    }
}
