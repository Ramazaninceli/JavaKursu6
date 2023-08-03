package Gun17;

public class _04_CharVeSayi {
    public static void main(String[] args) {
        //

        int sayi=65;
        System.out.println("sayi = " + sayi);

        char harf=(char) 65;
        System.out.println("harf = " + harf);

        //ascii tablosu

        for (int i = 0; i <=255 ; i++) {
            harf=(char) i;

            System.out.println(i+" nolu harf = " + harf);

        }

    }
}
