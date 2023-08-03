package Gun43;

public class _02_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        //ilkel tiplerda d
        if (cumle1==cumle2)
            System.out.println("cumle 1 ve cumle2 eşit");
        else
            System.out.println("cumle 1 ve cumle2 eşit DEĞİL");

        if (cumle1.equals(cumle2))
            System.out.println("cumle 1 ve cumle2 eşit");
        else
            System.out.println("cumle 1 ve cumle2 eşit DEĞİL");

        //Referans tiplerde ise durum
        //scanner ile ekrandan okudğunda aşağıdaki gibi oluyor
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        //manası referansları AYNIMI
        if (cumle3==cumle4)// == referans tiplerde REFERANSLARI aynı mı
            System.out.println("cumle 3 ve cumle4 eşit");
        else
            System.out.println("cumle 3 ve cumle4 eşit DEĞİL");

        //değerleri aynı mı
        if (cumle3.equals(cumle4))
            System.out.println("cumle 3 ve cumle4 eşit");
        else
            System.out.println("cumle 3 ve cumle4 eşit DEĞİL");

        // ÖZET : Nesne(String) ve referans(dizi,ArrayList,Nesneler) tiplerde
        //        HERZAMAN EQUALS kullanılır.
        //        İlkel (Sayısal, boolean) tiplerde == kullanılır

    }
}
