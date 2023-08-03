package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethot {
    public static void main(String[] args) {
        // kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        //dinizin en küçük, en büyük elemanını ve
        //ortalamasını ayır forksiyonlada bulup yazdırınız.

        Scanner oku=new Scanner(System.in);

        //5 lik bir dizi oluşturalım
        int dizi[]=new int[5];// 3 satır 2 sütün


        for (int i = 0; i < dizi.length; i++) {
               System.out.print("Enter a number: ");
                dizi[i] = oku.nextInt();
                  }
            enKucukYaz(dizi);
            enBuyukYaz(dizi);
            ortalama(dizi);


    }
    public static void enBuyukYaz(int[] dizi){
        //küçükten büyüğe doğru sıralayalım
        Arrays.sort(dizi);// diziyi küçükten büyüğe doğru sıralıyor
        System.out.println(Arrays.toString(dizi));//dizinin sıralamasını yazdırıyor
        System.out.println("En büyük sayı = " + dizi[dizi.length-1]);//sondaki elemanı yazdırıyor
    }

    public static void enKucukYaz(int[] dizi){
     //küçükten büyüğe doğru sıralayalım
        Arrays.sort(dizi);//küçükten büyüğe doğru sıralıyor
        System.out.println(Arrays.toString(dizi));//diziyi yardırıyor
        System.out.println("En küçük sayı = " + dizi[0]);//baştaki elemanı yazdırıyor
    }

    public static void ortalama(int[] dizi){
        int toplam=0;
        int ortalama=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];

        }
        ortalama=toplam/dizi.length;
                System.out.println("ortalama = " + ortalama);
        }

}
