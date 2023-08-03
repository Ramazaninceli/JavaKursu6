package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {


    public static void main(String[] args) {
        int sayi = 0;// 1 sayı
        int[] dizi = new int[100];//100 sayı
        // 3 derse göre
        int[] ders1Not = new int[50]; // 50 kişilik dersin notları
        int[] ders2Not = new int[50]; // 50 kişilik dersin notları
        int[] ders3Not = new int[50]; // 50 kişilik dersin notları

        int[][] tumDersNotları = new int[3][50]; // 3 tane 50 lik sayı topluyor

        ders1Not[0] = 80;// tek boyutlu dizinin ilk elemanı
        tumDersNotları[0][0] = 80; // 2 indexle gösterilir 2 boyutlu dizinin

        System.out.println("tumDersNotları = " + tumDersNotları[0][0]);
        Scanner oku = new Scanner(System.in);
        tumDersNotları[0][0] = oku.nextInt();

    }
}