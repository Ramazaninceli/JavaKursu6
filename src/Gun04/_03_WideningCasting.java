package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
       //Tip dönüşümleri 2 şekilde oluyor
        //1. küçük alanı büyüğe atma şeklinde oluyor (genişleme Widening deniyor)
        //byte->shor->int->long->float->double
        //veri kaybı kesinlile yok

        int sayi=9;
        long toplam=6700;
        double oran=3.2;

        oran=sayi;// veri kaybı yok tam sayı daha geniş ondalıklı hafızaya atılıyor
        System.out.println("oran = " + oran);// veri kaybı yok int double ye dönüştü

        toplam=sayi; // int->long

        System.out.println("toplam = " + toplam);

        oran=toplam; // long-> double
        System.out.println("oran = " + oran);




        //2. büyük alanı küçüge atılabiliyor
    }
}
