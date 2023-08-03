package Gun12;

public class _01_JavaRandom {

    public static void main(String[] args) {
        //
       double randSayi= Math.random(); // 0-0,999999 arası sayı üretir türü double olarak gelmekte
        System.out.println("randSayi = " + randSayi);
        //0 - 0,99999999
        // 10 la çarparsam
        // 0 - 9,999999 olur
        // (int) 0-9 tam sayı yapılır
        int rndTamSayi=(int) (Math.random()*11);// sadece tam sayı kısmı yazdırılır.
        System.out.println("rndTamSayi = " + rndTamSayi);
    }
}
