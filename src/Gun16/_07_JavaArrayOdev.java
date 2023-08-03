package Gun16;

import java.util.Arrays;

public class _07_JavaArrayOdev {
    public static void main(String[] args) {


        // 1 - Bu String'i oluşturun. "Removes white space from both ends of a string"
        //  String'deki kelime sayısını yazdırınız.

//          trim.split kullanarak yapıldı
//
//        String[] yazi = str.trim().split(" ");//trim.split Stringi boşluklara göre ayırırarak diziye dönüştürür.
//        int kelimeSayisi = yazi.length;
//        System.out.println("Kelime sayısı: " +yazi.length );

        // for kullanarak yapıldı

//        String str = "Removes white space from both ends of a string";
//
//        int boslukSayisi=0;
//        for (int i = 0; i <str.length(); i++) {
//
//            if ((str.charAt(i))==' ')
//                boslukSayisi++;
//        }
//
//        System.out.println("kelime sayısı = " + (boslukSayisi+1));


//    2 -    Bir String oluşturun : "Hello World"
//
//        Stringi tersten yazdırın ve print edin.
//
//        _Cevap böyle olmalı :  "dlroW olleH"_

//        String cumle = "Hello World";
//
//        char[] karakterDizisi = cumle.toCharArray();//bir dizenin her karakterini tek tek alır ve bunları bir karakter dizisi olarak döndürür.
//
//        for (int i = karakterDizisi.length-1 ; i >= 0; i--) {
//
//            System.out.print(karakterDizisi[i]);
//
//        }


//
//          3- İnt Array oluştur ve elemanları   : 25,30,30,35,100
//
//        Array in elemanlarının toplamını yazdır.
//
//                Cevap 220 olmalı.

//        int[] sayi={25,30,30,35,100};
//
//        int toplam=0;
//
//        for (int i = 0; i < sayi.length; i++) {
//            toplam=toplam+sayi[i];
//
//        }
//        System.out.println("toplam = " + toplam);


//       4- int Array oluşturun.
//
//       elemanları : 13, 15,14,16,16
//
//        Arrayin elemanlarını yazdırın.

//        int[] sayilar=new int[]{13, 15,14,16,16};
//
//        for (int i = 0; i < sayilar.length ; i++) {
//            System.out.println(i+1+". sayı = " + sayilar[i]);

        //  }

//       5-  String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
//
//        Array'daki eleman sayısını yazdırınız.
//
//        Cevap 4 olmalı.

//        String[] str={"new jersey" , "new york", "boston","California"};
//
//            System.out.println("Arraydeki eleman sayısı = " + str.length);

//     6-   String Array (Dizi) oluşturunuz.
//
//          elemanları : Apple, Orange , Babana, Kiwi
//
//          Array'leri tüm elemanları yazdırınız.

//        String[] meyveler={"Apple,Orange, Babana, Kiwi"};
//
//        for (String meyve:meyveler) {
//            System.out.println("fruit = " + meyve);
//        }


//   7 - int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//    Array'in ortalamasını alınız.

//        int[] sayi={12,14,21,23,10,4};
//        int toplam=0;
//        double ortalama=1;
//
//        for (int i = 0; i < sayi.length ; i++) {
//            toplam=toplam+sayi[i];
//
//        }
//        ortalama=toplam/ sayi.length;
//        System.out.println("ortalama = " + ortalama);


//    8 - int Array oluşturun ve elemanları : 5,6,8,12,14,19
//        Eğer sayı çiftse topla, tekse çıkar.
//                **Örneğin:**
// **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//        Toplamlarını yazdırın.

//        int[] sayi={5,6,8,12,14,19};
//
//        int toplam=0;
//        int fark=0;
//        int sonuc=0;
//
//        for (int i = 0; i < sayi.length ; i++) {
//
//            if (sayi[i]%2==0)//çift
//                toplam=toplam+sayi[i];
//
//            else
//
//           // if (!(sayi[i]%2==0))//tek sayı
//                fark=fark-sayi[i];
//
//          sonuc=toplam+fark;
//
//        }
//        System.out.println("sonuc = " + sonuc);

        //2. YOL
//
//        int[] Sayilar={5,6,8,12,14,19};
//        double Sonuc=0;
//        for (int i = 0; i < Sayilar.length; i++) {
//            if (Sayilar[i]%2==0)
//                Sonuc+=Sayilar[i];
//            else
//                Sonuc-=Sayilar[i];
//        }
//        System.out.println("Toplam="+Sonuc);


//     9- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
//
//        int[] dizi={15 , 25, 22, 18, 30};
//
//        int enbuyuk = dizi[0];
//        int ikinci = dizi[0];
//
//        for(int i=1;i<dizi.length;i++){
//
//            if(dizi[i]>enbuyuk)
//            {
//                ikinci=enbuyuk;
//                enbuyuk=dizi[i];
//            }
//            else if(dizi[i]>ikinci){
//                ikinci = dizi[i];
//            }
//        }
//        System.out.println("İkinci büyük sayı: " +ikinci);


//     10 - int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//        En küçük (minimum) sayıyı yazdırınız.

//        int[] sayilar={14 , 19 , 5 , 21};
//
//        int enKucuk=sayilar[0];
//
//        for (int i = 0; i < sayilar.length ; i++) {
//
//            if (sayilar[i]<enKucuk)
//                enKucuk=sayilar[i];
//        }
//        System.out.println("en küçük sayı = " + enKucuk);


//    11- int Array oluşturun ve elemanları : 12,2,5,15,8
//        En büyük değeri yazdırınız.

//        int[] sayilar={12,2,5,15,8};
//
//        int enBuyuk=sayilar[0];
//
//        for (int i = 0; i < sayilar.length ; i++) {
//
//            if (enBuyuk<sayilar[i])
//                enBuyuk=sayilar[i];
//
//        }
//
//        System.out.println("enBuyuk = " + enBuyuk);


//     12-   String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//        Eğer aitse "true" çevirin.
//                Loops (döngüler) kullanın.

//        String[] meyveler={"Apple" , "Orange" , "Banana" , "Pineapple"};
//
//        boolean varMı=false;
//
//        for (int i = 0; i < meyveler.length ; i++) {
//
//            if (meyveler[i].equalsIgnoreCase("ceviz")){
//                varMı=true;
//            }
//
//        }
//
//        System.out.println("varMı = " + varMı);


//        13-
//
//         Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
//
//        $ işaretlerini kaldırın ve sayıları toplayın.
//
//        Sayıların toplamını yazdırın.
//
//        String str = "$12 $23 $10 $2 $5 $2";
//
//        String[] numbers = str.replaceAll("\\$", "").split(" ");
//
//        int toplam = 0;
//
//        for (String number : numbers) {
//
//            toplam += Integer.parseInt(number);
//
//        }
//
//        System.out.println("toplam = " + toplam);

        //     12-   String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//        Eğer aitse "true" çevirin.
//                Loops (döngüler) kullanın.

//        String[] meyveler={"Apple" , "Orange" , "Banana" , "Pineapple"};
//
//        boolean varMı=false;
//
//        for (int i = 0; i < meyveler.length ; i++) {
//          if ( meyveler[i].equalsIgnoreCase("apple")){
//            varMı=true;}
//        }
//        System.out.println("varMı = " + varMı);
   }


}












