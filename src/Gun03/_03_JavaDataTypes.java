package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {

        int sayi = 5; // hafızada int kadar yer kaplar. sadece tamsayı atılabilir
        // tamsayılarda defaul int  dir.

        //tam sayilar,

        byte byteDeger = 7;//-128 - +127 arası
        short shortDeger = 1645; // -32000 - + 32000
        int intDeger = 250000;
        long longDeger = 2434343434l; // int i aşan bir sayıysa en sonuna l harfi konulursa long tipinde olduğu anlaşılır

        // ondalıklı sayılar
        // ondalıklı sayıların defaultu double dır.
        float floatDeger = 3.1434f; // noktadan sonra 5 haneye kadar hassasiyeti var defaultu double olduğundan dolayı sonuna f konulmalıdır.
        double doubleDeger = 3.143434343434;// noktadan sonra 16 haneye kadar hassasiyeti var


        // karakter ve harfler
        char basHarf = 'A'; // bir tane harf saklayabilir.
        String isim = "Ramazan"; // kelime veya cümle saklayabilir uzunluğu değişken

        System.out.println("isim = " + isim);
        System.out.println("basHarf = " + basHarf);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("sayi = " + sayi);

    }
}
