package Gun03;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // Örnek soru : yarıçapı 4.2 olan bir dairenin çevresini ve alanını bulun?
        // çevre = 2 *yarıçap*3,14; alan =3,14*yarıçap*yarıçap
        //double yaricap, cevre, alan; da olur

        double yariCap = 4.2;

        double cevre = 2 * yariCap * 3.14;
        double alan = 3.14 * yariCap * yariCap;

        System.out.println("alan = " + alan + "cm");
        System.out.println("cevre = " + cevre + "cm2");
    }
}
