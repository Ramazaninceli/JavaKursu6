package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

        int toplam=6700;
        byte sayi=5;

        sayi= (byte) toplam;// veri kaybı olmasa bile dikkatli yapılmalı. doğru sonuç vermiyor

        System.out.println("sayi = " + sayi);// veri kaybı var.

        double oran =3.7;//ben tamsayı kısmını almak istiyorum
        toplam=(int) oran;// int ekleyip bilerek sadece tamsayı kısmını aldım.
        System.out.println("toplam = " + toplam);
        // veri kaybı var ancak bilerek yaptım.

    }
}
