package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _07_JavaMethodOdev {
    public static void main(String[] args) {

        int x = 1, y = 2, r=3; r *= x + y;
        System.out.println(r);


//        //1-randomNum metodunu yazdırmak
//        System.out.println("Random numara = " +  randomNum(10));
//
//        //2-"OrtaKelime" isminden bir method oluşturun.
//        System.out.println("Ortadaki kelime :" +ortaKalemi("Ben javayı seviyorum kolayca öğreniyorum "));
//
//        //3-"reverseString" isminden bir method oluşturun.
//        System.out.println(reverseString("Ben javayı seviyorum ve kolayca öğreniyorum "));
//
//        //4-"reverseWord" isminden bir method oluşturun.
//        System.out.println(reverseWord("Ben javayı seviyorum ve kolayca öğreniyorum "));
//
//        //5- Girilen bir diziyi tersten yazdıran bir metod yazınız
//        tersDizi();
//
//        //6-  powerOfThree isminde bir method oluşturun.
//        System.out.println("\n"+ powerOfThree(-26));
//
////   1- Ismi **randomNum** olan bir method oluşturun.
////      Parametre olarak **int max** almalı.
////      Bu method, 0 ile max arasında random bir değer döndürmelidir.
////      Random numarayı döndürünüz.
 }
//  public static int randomNum (int max){
//        return (int)(Math.random()*(max+1));// 0-max(dahil) arası random sayı üretip geri döndürür.
//  }
//
//
////  2- "OrtaKelime" isminden bir method oluşturun.
////     Bu method String'i parametre olarak almalı.
////     Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
////     Ortadaki kelimeyi return yapınız.
////     Örnek: Ben Java'yı seviyorum.
////     print : Java'yı
////     Örnek2:
////    Java'yı kolayca öğreniyorum.
////    print: kolayca
////
////
////OrtaKelime" isminden bir method oluşturun.
//    public static String ortaKalemi(String cumle){
//
//        String[] kelimeler=cumle.split(" ");//cümleyi kelimeler arasındaki boşluklara göre ayırarak kelimeleri bir diziye koy." \\s+" bu ifade dizideki virgülleri siliyor
//        int ortaIndex=kelimeler.length/2; // kelime sayısının yarısını alarak ortadaki kelimenin indisini hesaplar
//        return kelimeler[ortaIndex]; // ortadaki kelimeyi geri çevir(return)
//    }
//
////   3-   reverseString isminde bir method oluşturun.
////        Bu method bir String'i parametre olarak alsın.
////        Ve bu method, girilen String'i tersten yazsın.
////        Terste yazılmış halini yazdırınız.
////        Örn: String = "Java'yı Seviyorum."
////        Print: .muroyiveS ıy'avaJ
//
//    public static String reverseString(String cumle){
//        String cumle1="";
//        char[] karakterDizisi = cumle.toCharArray();//bir dizenin her karakterini tek tek alır ve bunları bir karakter dizisi olarak döndürür.
//        for (int i = karakterDizisi.length-1 ; i >= 0; i--)
//            System.out.print((karakterDizisi[i]));
//        return cumle1;
//
//    }
////   4-  adı  reverseWord olan bir method oluşturun
////       Bu methodun String olarak bir parametresi olmalıdır
////       Ve bu cümledeki kelimelerle tersine çevirmeli
////        Ters halini yazdırın.
////        Örnek 1 :
////        Dize: Java yazın
////       dönüş şöyle olmalıdır:  yazın Java
//    public static String reverseWord(String cumle){
//        String cumle1 = "";
//        String[] kelimelerDizisi = cumle.split(" ");//bir dizenin her kelimesini tek tek alır ve bunları bir kelime dizisi olarak döndürür.
//        for (int i = kelimelerDizisi.length - 1; i >= 0; i--)
//            System.out.print((kelimelerDizisi[i] + " "));
//        return cumle1;
//}
//// 5- Girilen bir diziyi tersten yazdıran bir metod yazınız.
//    public static String tersDizi() {
//        Scanner oku =new Scanner(System.in);
//        System.out.print("cümle giriniz :");
//        String cumle=oku.nextLine();
//
//     String[] kelimelerDizisi = cumle.split(" ");//bir dizenin her kelimesini tek tek alır ve bunları bir kelime dizisi olarak döndürür.
//    for (int i = kelimelerDizisi.length - 1; i >= 0; i--)
//        System.out.print((kelimelerDizisi[i] + " "));
//    return cumle;
//}
//// 6-  powerOfThree isminde bir method oluşturun.
////      Parametre olarak int
////      Return tipi boolean
////      Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
////      **Örnek 1:**
////      ```
////     **Girdi:** 27
////     **Çıktı:** true
////     ```
////     ```
////     Açıklama: 3*3*3 =27
////     ```
////     ```
////     Sonuç= true
////     ```
////
////public static boolean powerOfThree(int sayi){
////
////    if ( sayi == 0) {// sayı o ise false
////        return false;
////    }
////    while (sayi > 1 || sayi<-1) {
////        if (sayi % 3 != 0) {
////            return false;
////        }
////        sayi = sayi / 3;
////    }
////    return true;
//
//
//
//

}




