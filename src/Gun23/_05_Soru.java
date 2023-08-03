package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class _05_Soru {
    public static void main(String[] args) {
        //10  elemanlı bir diziyi romdom (10(darihl) a kadar olan sayılarla
        // doldurduktan sonra tekrarlı değerleri almayacak şekilde yeni bir
        //diziye atayınız.

        //int[] dizi=new int[10];// bu şekilde de olur
        Integer[] dizi=new Integer[10];
        for (int i = 0; i <10  ; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }
            //1. yöntem
            TreeSet<Integer> ts=new TreeSet<>();
            for (int i = 0; i < dizi.length ; i++) {
                ts.add(dizi[i]);

            }
            System.out.println("ts tekrarlamayan = " + ts);

            //2.yöntem
            TreeSet<Integer> ts2=new TreeSet<>(Arrays.asList(dizi));
            System.out.println("ts2 tekrarlamayan = " + ts2);


        System.out.println("normal = " + Arrays.toString(dizi));



    }
}
