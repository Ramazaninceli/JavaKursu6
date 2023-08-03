package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler={"Ahmet","Zeynep","Roman","Kaya","Cihan"};

        //diziyi direk ekrana yazdırmak için

        System.out.println("isimler = " + Arrays.toString(isimler));
        
        int[] a ={1,8,3,54};
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        
        //dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler) = " + Arrays.toString(isimler));

        //diziler eşit mi
        int[] b={1,8,3,54};
        int[] c={1,3,8,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));//true a ve b eşit
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));//false a ve c eşit değil

        //contais gibi çalışır var ise pozitif sayı veriri yok ise negatif
        //sadece sıralı dizilerde çalışır
        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a,3));// - değer yok demektir
        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(c,3)); // 1 , var demek


        //diziyi bir değer ile hızlıca doldurmak için
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));// a yı 5  ile doldurur



    }
}
