package Gun27.Ornek3Tekrar;

import java.util.ArrayList;

public class Ogrenci {
    String name;
    int maxSaat;

    ArrayList<Ders> dersleri=new ArrayList<>();

    public void dersYazdir(){
        System.out.println("***Transkript");
        System.out.println("Sayın = " + this.name);
        System.out.println("dersler aşağıda gibidir: ");

        for (Ders d:dersleri ) {
            System.out.println(d.name + " "+d.saat);
            }

    }
    public static void Kurallar(){
        System.out.println("verimli çalış");
    }
}
