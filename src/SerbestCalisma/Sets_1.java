package SerbestCalisma;

import java.util.*;

public class Sets_1 {
    public static void main(String[] args) {

        //10  elemanlı bir diziyi romdom (10(darihl) a kadar olan sayılarla
        // doldurduktan sonra tekrarlı değerleri almayacak şekilde yeni bir
        //diziye atayınız.

        Integer[] dizi=new Integer[10];
       // Set<Integer> dizi1=new TreeSet<>();

        for (int i = 0; i < dizi.length; i++) {
           dizi[i] = (int) (Math.random() * 11);
         //  dizi1.add(dizi[i]);


        }
       // System.out.println("dizi1 = " + dizi1);


        TreeSet<Integer> ts2=new TreeSet<>(Arrays.asList(dizi));
        System.out.println("ts2 = " + ts2);


        }






    }

