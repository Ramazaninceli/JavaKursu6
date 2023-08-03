package Proje;

import java.util.Scanner;

public class _01_Proje {
    public static void main(String[] args) throws InterruptedException {
//        PROJE-1
//
//        1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
//        2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
//        3. Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
//        Örn:
//        Hangi Kahveyi İstersiniz?
//                1.Türk kahvesi
//        2.Filtre Kahve
//        3.Espresso
//
//        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
//        (örn: Türk Kahvesi,  ya da türk kahvesi.)
//
//        --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
//
//        1. Koşul bölümü
//        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.
//        (Dümdüz Türk kahvesi yazmayın String hangiKahve'yi çağırın!!)
//        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
//        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
//        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın.
//        (Hatalı tuslamadan sonra kod calısmaya devam edecektir.)
//
//        >> TODO
//        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
//        "Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
//
//        String sut olusturun.
//                todo 2.Koşul Bölümü
//        eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.         --
//                (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
//
//                eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
//
//                >> TODO
//        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
//        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
//        String seker oluşturunuz.
//
//                >> TODO 3.Koşul Bölümü
//        todo if(){
//            Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
//            Sorunun altına int kacSeker  oluşturunuz.
//                    Şeker sayısını giriniz.
//            Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların hepsi if bloğunun içerisinde olacak)
//            todo }
//        todo else{
////            Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
////
////            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor.
////            (String bosKod = sc.nextLine();)  dummy kod ekleyiniz.
////
////                    Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
////            (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
////            String boyut oluşturun...
////
////            >> TODO 4.Koşul Bölümü
////            eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
////            (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
////
////            Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
////
////            Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)
////
////                    >> SONUÇ BÖLÜMÜ
////
////            Siparişlerimizi verdik. Son hali görmek istiyoruz.
////            konsola şunu yazdırın örnek :
////
////            Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.
////                    orta boy için de String boyut ' u kullanın.)


        Scanner Consol=new Scanner(System.in);
        System.out.println("Hoş Geldiniz!");
        System.out.println("[1]Espresso");
        System.out.println("[2]Cappuccino");
        System.out.println("[3]Americano");
        System.out.println("[4]Cafe Latte");
        System.out.println("[5]Türk Kahvesi");
        System.out.println("[6]Caffee Macchiato");
        System.out.println("[7]Mocha");
        System.out.println("[8]Filtre Kahve");
        System.out.print("Hangi Kahveyi İstersiniz?"+" "+"(1-8)"+" :");
//        System.out.println("Hoş Geldiniz!");
//        String kahveCesit=  "\n[1]Espresso \n"
//                           +"[2]Cappuccino \n"
//                           +"[3]Americano \n"
//                +"Hangi kahveyi istersiniz?" + " "+"(1-3)"+":";
//        System.out.println("kahveCesit = " + kahveCesit);

        int KahveSecimi=0;
        String Kahve="";
        while (KahveSecimi < 1 || KahveSecimi > 8){
            KahveSecimi=Consol.nextInt();
            switch (KahveSecimi) {
                case 1:
                    Kahve="Espresso";
                    System.out.println("Espresso Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 2:
                    Kahve="Cappuccino";
                    System.out.println("Cappuccino Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 3:
                    Kahve="Americano";
                    System.out.println("Americano Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 4:
                    Kahve="Cafe Latte";
                    System.out.println("Cafe Latte Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 5:
                    Kahve="Türk Kahvesi";
                    System.out.println("Türk Kahvesi Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 6:
                    Kahve="Macchiato";
                    System.out.println("Caffee Macchiato Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 7:
                    Kahve="Mocha";
                    System.out.println("Mocha Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 8:
                    Kahve="Filtre Kahve";
                    System.out.println("Filtre Kahve Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                default:
                    System.out.print("Geçersiz Seçim, Tekrar Seçim Yapınız:");
                    break;
            }
        }
        Consol.nextLine();
        System.out.print("Süt ister misiniz? (Evet/Hayır): ");
        String SutSecimi = Consol.nextLine();
        boolean Sut=SutSecimi.equalsIgnoreCase("Evet");
        if (SutSecimi.equalsIgnoreCase("Evet")) {
            System.out.println("Kahveniz Sütlü Hazırlanıyor...");
            Thread.sleep(2000);
        }else {
            System.out.println("Kahveniz Sütsüz Hazırlanıyor...");
            Thread.sleep(2000);
        }

        System.out.print("Şeker Eklemek İster misiniz?"+"(Evet/Hayır):");
        String SekerSecimi=Consol.nextLine();
        boolean Seker=SekerSecimi.equalsIgnoreCase("Evet");
        int Adet=0;
        if (SekerSecimi.equalsIgnoreCase("Evet")) {
            System.out.print("Kaç Şeker İstersiniz?:");
            int KacSeker = Consol.nextInt();
            Adet=KacSeker;
            System.out.println(Adet + " " + "Adet" + " " +"Şeker"+" "+"Ekleniyor");
            Thread.sleep(2000);
        }else {
            System.out.println("Şekersiz Hazırlanıyor...");
        }

        System.out.println("Hangi boy kahve istersiniz?");
        System.out.println("1. Küçük");
        System.out.println("2. Orta");
        System.out.println("3. Büyük");
        System.out.print("Boy seçiminizi yapın (1-3): ");
        int BoySecimi =0;
        String Boyut = "";
        while (BoySecimi < 1 || BoySecimi > 3) {
            BoySecimi = Consol.nextInt();
            switch (BoySecimi) {
                case 1:
                    Boyut = "Küçük";
                    System.out.println("Küçük Boy Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 2:
                    Boyut = "Orta";
                    System.out.println("Orta Boy Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                case 3:
                    Boyut = "Büyük";
                    System.out.println("Büyük Boy Hazırlanıyor...");
                    Thread.sleep(2000);
                    break;
                default:
                    System.out.print("Geçersiz Seçim, Tekrar Seçim Yapınız:");
                    break;
            }
        }
        System.out.print("Siparişiniz: ");
        if (Sut) {
            System.out.print("Sütlü," + " ");
        }else {
            System.out.print("Sütsüz," + " ");
        }
        if (Seker) {
            System.out.print(Adet + " " + "Şekerli," + " ");
        }else {
            System.out.print("Şekersiz,"+" ");
        }
        System.out.println(Boyut+" "+"Boy,"+" "+Kahve+" "+"Hazır!");
        System.out.println("AFİYET OLSUN!");
    }

}
