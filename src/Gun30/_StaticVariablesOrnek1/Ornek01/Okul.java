package Gun30._StaticVariablesOrnek1.Ornek01;

public class Okul {
    public static void main(String[] args) {

//      Ogrenci ogr1=new Ogrenci("ismet","Temur","Yıldırm ilkokulu");
//        Ogrenci ogr2=new Ogrenci("ahmet","Tem","Yıldırm ilkokulu");
//        Ogrenci ogr3=new Ogrenci("mehmet","ur","Yıldırm ilkokulu");
//
//        Ogrenci ogr500=new Ogrenci("lam","uk","Yıldırm ilkokulu");

        // yıldırım ilkokulu sürekli tekrar ettiğinden okul adı static yapıldı ve değer atandı

        Ogrenci ogr1=new Ogrenci("ismet","temur");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Atatürk ilkokulu";
        System.out.println("ogr1 = " + ogr1);


        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi


    }
}
