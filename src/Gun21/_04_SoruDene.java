package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04_SoruDene {
    public static void main(String[] args) {

        //Soru 2 - ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Orange");
        meyveler.add("Kiwi");
        meyveler.add("Peach");
        meyveler.add("Banana");
        meyveler.add("Orange");

        int sayac=getCount(meyveler, "Orange");
        System.out.println("sayac = " + sayac);
    }

    public static int getCount(ArrayList<String> arrayList, String target) {
        int sayac = 0;
        for (String a : arrayList) {
            if (a.equals(target)){
                sayac++;}

        }
        return sayac;


    }


}

