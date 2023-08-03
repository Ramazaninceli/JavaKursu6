package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

//        int[] dizi=new int[50];
//        uzunluk sabit.değiştirilemiyor.
//
//        int sayi; integer tipinde bir değişken
//
//        sayın java, bana öyle bir dizi tipi ver ki
//        ben ekledikçe boyu uzasın.sildikçe kısalsın
//
//        java derki : güzel olur tamam vericem.
//        Fakat şunu bil, kaç eleman olduğu belli ise
//        şu ana kadar gösterdiğim dizi tipini kullan
//        çünkü bu hızlı çalışıyor,
//        senin istediğin DİNAMİK dizi olduğundan
//        bundan yavaş çalışacaktır
//
//        liste : eklersin silersin, boyu ona göre değişir.


        /// dizi,array: boyut sayısı belli , sonradan değiştirelemz
        //        int[] dizi=new int[5]; // 5 elemanlı Array, boyutu değiştirilemez
        //
        //        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        //        // ArrayList : boyutunu baştan vermen gerekmiyor. boyutu başlangıçta 0
        //        // eleman ekledikçe artar, sildikçe kısalır.


        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringsList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet");//uzunluk 1
        isimler.add("Metin");//uzunluk 2
        isimler.add("Burak");//uzunluk 3
        isimler.add("Cansu");//uzunluk 4 // sona ekler
        isimler.add(1,"Ramazan");// Ahmeti ramazan olarak değiştirir.

        System.out.println("isimler = " + isimler); // yazdırır
        System.out.println("isimler size = " + isimler.size()); // uzunluğunu verir lenght gibi

        isimler.add(1,"Nurhayat"); // verilen ındex e ekliyor diğerleri 1 kayıyor sona doğru
        System.out.println("isimler = " + isimler);
        System.out.println("isimler size = " + isimler.size());

        isimler.set(1,"Elife");// verilen indexdeki elemanı değiştirir.
        System.out.println("isimler = " + isimler);

        boolean VarMi=isimler.contains("Elife"); // Elif var mı
        System.out.println("Elif VarMi = " + VarMi);

        isimler.remove(2); // Burak indexe göre sil
        System.out.println("isimler = " + isimler);

        int indexOfMetin= isimler.indexOf("Ahmet");// metinin indexi
        System.out.println("indexOfMetin = " + indexOfMetin);

        String ilkEleman= isimler.get(0);//0. elemanı verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();
        System.out.println("isimler = " + isimler);


    }
}
