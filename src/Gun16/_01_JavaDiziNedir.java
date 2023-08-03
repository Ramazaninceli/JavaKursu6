package Gun16;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        //
        int sayi=0;

        int ogrNot=0;

        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        //.....
        //.....
        //....
        int ogrNot50;

       //bana bir tanımlamada  BİRDEN FAZLA değer tutabilen bir değişkene ihtiyacımız var.
        // çözüm:
        int[] notlar=new int[50];
        notlar[0]=75;
        notlar[1]=88;

        notlar[49]=95; // en son eleman toplam eleman sayısı -1 length-1dir böylece 0-49 indexdir.
        //notlar[50]=56  challenger patlar

        System.out.println("notlar = " + notlar[0]);
        System.out.println("notlar.length = " + notlar.length);// 50 yani toplam eleman sayısını verir.

    }
}
