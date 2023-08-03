package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        //Günün sorusu : 3*2 lik bir diziyi kullanıcıdan sayı olarak
        // doldurduktan sonra sadece tek elemanlarını tek boyutlu bir diziye atayınız.

        Scanner oku=new Scanner(System.in);

        //3*2 lik bir dizi oluşturalım
        int[][] tablo=new int[3][2];// 3 satır 2 sütün

        // kullanıcıdan giriş yaptırarak tabloya sayı doldurup tek olan sayıların miktarını buluyoruz.
        int tekMik=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter a number: ");
                tablo[i][j] = oku.nextInt();   //00 01 10 11 20 21 değerleri alıyor

                if (!(tablo[i][j]%2==0))// tek olanların sayısını buluyoruz
                    tekMik++;
            }
        }

        int[] tekler=new int[tekMik];
        int teklerIndex=0;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 2; j++) {

                if (!(tablo[i][j]%2==0)) {
                    tekler[teklerIndex] = tablo[i][j];
                    teklerIndex++;
                }
            }
        }

        System.out.println(Arrays.toString(tekler));
    }

}



