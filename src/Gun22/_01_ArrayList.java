package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        //Array -> Arrays Metodları
        //AraasList-> Collection Metodlar

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //sıralama
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //tersine çevirme
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //bütün sayıları tek bir değerle set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        //replace verilen değeri verilen değerle değiştirem
        Collections.replaceAll(sayilar,0,5);//0 ları  5 e çevir
        System.out.println("sayilar = " + sayilar);

        //tanımlarken değer atama
        int[] dizi={2,3,45,56};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,78,89));
        ArrayList<String> strListe=new ArrayList<>(Arrays.asList("ahmet","ayşe","kaya"));
        System.out.println("liste = " + liste);
        System.out.println("strListe = " + strListe);

        //addAll: bir veya fazla değerleri liste ekler
        Collections.addAll(sayilar,56,77,88,99,77);
        System.out.println("sayilar = " + sayilar);

        //bir diziyi nasıl bir Arrayliste atarsın
        Integer[] dizi2={2,3,45,56};
        ArrayList<Integer> liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);
    }
}
