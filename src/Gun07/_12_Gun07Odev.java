package Gun07;

import java.util.Scanner;

public class _12_Gun07Odev {
    public static void main(String[] args) {

// 1- soru **I love java** olan bir String oluşturun.
        //Bu cümlenin toplam karakter sayısını yazdırın.

//        String cumle="I love java";
//        int karakterSayı=cumle.length();//11
//        System.out.println("Cümlenin karaktersayısı = " + karakterSayı);


// 2 - soru **Sprint planning** olan bir String oluşturun.
//Bu dizenin _toplam karakter sayısını_ yazdırın.

//        String cumle="Sprint planning";
//        int karakterSayi=cumle.length();//15
//        System.out.println("Cümlenin karakter sayısı = " + karakterSayi);

// 3 - soru **apple** olan bir String oluşturun.
//String'in _içinde_ **app** olup olmadığını **doğrula**.

//        String cumle = "apple";
//        boolean varMı=cumle.contains("app");//true
//        System.out.println("varMı = " + varMı);

// 4 - soru **orange** kelimesinden oluşan bir String oluşturun.
// String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

//        String kelime="orange";
//        boolean esitMi=kelime.contains("Apple");//false
//        System.out.println("esitMi = " + esitMi);

// 5 - **apple**  olan  bir String oluşturun.
//String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
//_Büyük harf veya küçük harf önemli değildir._

//        String kelime="Apple";
//        boolean esitMi=kelime.toUpperCase().contains("APPLE");//true
//        System.out.println("esitMi = " + esitMi);

// 6 - **Florida** kelimesinden bir String oluşturun.
//Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

//        String kelime="Florida";
//        int oHarf=kelime.indexOf("o");
//        System.out.println(" O Harfi = " + oHarf+". Indexte");

// 7 - **Thank you** olan bir String oluşturun.
//Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

//        String kelime="Thank you";
//        int yHarf=kelime.indexOf("y");
//        System.out.println("y Harfi = " + yHarf + ". Indexte");

// 8 - **Main method** oluşturun.
//**Mouse** değerinde bir String oluştur.
//Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

//        String kelime="Mouse";
//        char karakter=kelime.charAt(2);
//        System.out.println("3. sıradaki karakter = " + karakter + "'dur");

// 9 - **paper** olan bir String oluşturun.
//String'i _büyük harfe_ çevirin ve yazdırın.
//örn: apple > APPLE

//            String kelime="paper";
//            System.out.println("paper ın büyük yazımı  = " +kelime.toUpperCase() );

// 10 - *OraNge** olan bir String oluşturun.
//String'i _küçük harfe_ çevirin ve yazdırın.
//örn: APPLE > apple

//        String kelime="OraNge";
//        System.out.println("OraNge ın küçük yazımı  = " +kelime.toLowerCase() );

// 11 - **New Jersey** olan bir String oluşturun.
// String'i _büyük harfe_ çevirin ve yazdırın

//         String kelime="New Jersey";
//         System.out.println("New Jersey ın büyük yazımı  = " +kelime.toUpperCase() );

// 12 - **New York** olan bir String oluşturun.
// String'i _küçük harfe_ çevirin ve yazdırın.
//        String kelime="New York";
//       System.out.println("New York un küçük yazımı  = " +kelime.toLowerCase() );

// 13 - **PADDLE** olan bir String oluşturun.
//String'i _küçük harfe_ çevirin ve yazdırın.
//        String kelime="PADDLE";
//         System.out.println("PADDLE in küçük yazımı  = " +kelime.toLowerCase() );

// 14 - Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

//        Scanner oku=new Scanner(System.in);
//
//        System.out.print("Adınızı giriniz : ");
//        String ad= oku.nextLine();
//        System.out.print("Soyadınızı giriniz : ");
//        String soyAdı= oku.nextLine();
//
//        System.out.println("Adınız ve Soyadınız : " +ad + " "+ soyAdı);
//        System.out.print("Adınız ve Soyadınız concat: "+ ad.concat(" "+soyAdı));

//15- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

//        Scanner oku=new Scanner(System.in);
//
//        System.out.print(" kelime girin :");
//        String kelimeGir= oku.nextLine();
//        System.out.println("kelime boş mu() = " + kelimeGir.isEmpty());

//16- Girilen bir kelimenin ilk ve son harfini bulunuz.

//        Scanner oku=new Scanner(System.in);
//
//        System.out.print("bir kelime girin : ");
//        String gir= oku.nextLine();
//        char ilkHarf=gir.charAt(0);
//        int uzunluk=gir.length();
//        char sonHarf=gir.charAt(uzunluk-1);
//        System.out.println("ilkHarf = " + ilkHarf);
//        System.out.println("sonHarf = " + sonHarf);

// 17 - tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını      A.E.Y. şeklinde yazınız.
//     mesala : Mehmet Alı Yılmaz -> M.A.Y

//            Scanner oku=new Scanner(System.in);
//            System.out.print("Ad soyad giriniz :");
//            String adSoyad= oku.nextLine();
//
//
//            char adi=adSoyad.charAt(0);
//            char adi1=adSoyad.charAt(adSoyad.indexOf(" ")+1);
//        char soyAd=adSoyad.charAt(adSoyad.indexOf(" ",adSoyad.indexOf(" ")+1)+1);
//
//        System.out.println(adi+"."+adi1+"."+soyAd);

//18- tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını     ayrı ayrı yazdırınız.
//      mesala : Mehmet Alı Yılmaz -> Mehmet  i  Ali  yi ve Yılmaz ı ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad 2.Ad ve Soyadını giriniz:");
        String ad= oku.nextLine();

        int ilkBoslk=ad.indexOf(" ");
        int ikinciBoslk=ad.indexOf(" ",ilkBoslk+1);

        String adiniz = ad.substring(0,ilkBoslk);
        String adiniz1 = ad.substring(ilkBoslk+1,ikinciBoslk);
        String soyAdiniz=ad.substring(ikinciBoslk+1);

        System.out.println("adiniz =" + adiniz);
        System.out.println("adiniz1 =" + adiniz1);
        System.out.println("soyAdınız = " + soyAdiniz);

 }
}
