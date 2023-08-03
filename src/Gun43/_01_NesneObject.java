package Gun43;

import java.util.ArrayList;
import java.util.Objects;

public class _01_NesneObject {
    public static void main(String[] args) {

        //her şey bir nesne(object) mi?
        //kisi ogr1 = new Student();
        //Object ogr1=new Student();

        ArrayList<Object> genelList=new ArrayList<>();
        genelList.add("ismet");
        genelList.add(1);
        genelList.add(3.5);
        genelList.add(true);
        System.out.println("genelList = " + genelList);
        //her tip eklenebiliyor , çünkü bütün tipler
        //Object ten türetildiği için

        double oran=10/3.0;
        System.out.println("oran = " + oran);
       // System.out.printf("formatı yaz", değişkenleri yaz);
        System.out.printf("%f",oran);// %f: % değişkeninin geleceği yer
                                    // f: double ,float kesirli
        System.out.println();

        System.out.printf("sonuç %4.1f\n",oran);
        //4: toplamda 4 tane  kullanılacak, nokta dahil
        //1: noktadan sonra kaç hane kullanılacak.

        System.out.printf("sonuç %-4.1f\n",oran);// - (eksi) sola dayalı yazar

        int sayi=5;
        System.out.printf("sonuç= %-5.2f , tamSayi=%4d", oran,sayi);
        // f: double ve float
        // d: decimal: tam sayı
        // s: string değişkenler

    }
}
