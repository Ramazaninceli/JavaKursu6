package Gun13;

import java.util.Scanner;

public class _09_WhileOdev {
    public static void main(String[] args) {


        //kendini zorlamak isteyenler için : aşağıdaki sorular çözülemezse kesinlikle üzülmüyorum
        //
        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.
        //
        //8- Girilen bir sayının kaç basamak olduğunu bulunuz.
        //
        //9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.
        //
        //10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?


        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
//
//        Scanner oku=new Scanner(System.in);
//
//        int sayac=1;
//        int toplam=0;
//
//        while (sayac<=20){
//
//            System.out.print(sayac+ ". sayıyı girin : ");
//            int sayi= oku.nextInt();
//            if (!(sayi%2==0))
//                toplam=toplam+sayi;
//            sayac++;
//        }
//        System.out.println("tek sayıların toplamı = " + toplam);


//2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

//        Scanner oku=new Scanner(System.in);
//
//        int sayac=1;
//        int tekSayiAdet=0;
//
//        while (sayac<=5){
//
//            System.out.print( sayac+ ". sayıyı giriniz :");
//            int sayi= oku.nextInt();
//            if (!(sayi%2==0))
//              tekSayiAdet=tekSayiAdet+1;
//            sayac++;
//        }
//
//        System.out.println("tekSayiAdet = " + tekSayiAdet);


        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

//        Scanner oku=new Scanner(System.in);
//        System.out.print("sayı giriniz : ");
//        int sayi= oku.nextInt();
//
//        if (sayi<0)
//            System.out.println("negetif sayı girilemez");
//
//        int sayac=1;
//        int toplam=0;
//
//            while (sayac <= sayi) {
//
//               if (sayac < sayi)
//               toplam = toplam + sayac;
//                sayac++;
//            }
//            System.out.println("toplam = " + toplam);


        //4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

//        Scanner oku=new Scanner(System.in);
//
//        int sayac=1;
//        int toplam=0;
//
//        while (sayac<=20){
//
//            System.out.print(sayac + ". sayıyı giriniz : ");
//            int sayi= oku.nextInt();
//
//            if (sayi>10 & sayi<30)
//                toplam=toplam+sayi;
//                sayac++;
//        }
//        System.out.println("toplam = " + toplam);


//5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.


//        int sayac=0;
//        int birleriBes=0;
//
//        while ( sayac<100){
//            if (sayac%10==5)
//                birleriBes=birleriBes+1;
//            sayac++;
//        }
//        System.out.println("Birler basamağı 5 olan sayılar miktarı  = " + birleriBes);

        //6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //
        //    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //
        //   Eğer bilirse tebrikler yazsın.

//        Scanner oku=new Scanner(System.in);
//
//        int tutulanSayi= (int) (Math.random()*10)+10;
//        System.out.println("TutulanSayi = " + tutulanSayi);
//
//        int sayac=1;
//        int tahmin=0;
//         do {
//             System.out.print(sayac + " .Tahmininizi giriniz : ");
//             tahmin= oku.nextInt();
//             if ((tutulanSayi == tahmin) )
//               System.out.println("Tebrikler = " + tutulanSayi);
//             sayac++;
//             if ((sayac>3) )
//                 break;
//
//        }while (!(tutulanSayi == tahmin));
//
//        if (!(tutulanSayi == tahmin))
//        System.out.println("BileMEdin tutulan sayı= " + tutulanSayi);
//        else
//            System.out.println();

        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı girin :");

        String sayi= oku.nextLine();
        int indeks=sayi.indexOf(0);

                String birler=sayi.substring(2);
        String onlar =sayi.substring(1,2);
        String yuzler=sayi.substring(0,1);
       System.out.println("yüzler : " +yuzler+" onlar :"+onlar+" birler : " +birler);


            }
}
