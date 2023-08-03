package Gun28._01_Ornek;

public class Okul {
    public static void main(String[] args) {


        Ogrenci ogr1 = new Ogrenci();

        //1.yol
        ogr1.Id=1;
        ogr1.ad="Mehmet";
        ogr1.soyadi="yilmaz";
        ogr1.sinifi=6;
        System.out.println("ogr1.ad = " + ogr1.ad);

        //2.yol
        Ogrenci ogr2 = new Ogrenci(2, "Miraç", "yılmaz", 5);
        System.out.println("ogr2.ad = " + ogr2.ad);
        //3.yol
        Ogrenci ogr3= new Ogrenci(3,"Ramazan","ince");
        System.out.println("ogr3.ad = " + ogr3.ad);


    }   
    
}
