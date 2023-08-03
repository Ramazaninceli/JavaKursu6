package TekrarDersler;

import java.util.Scanner;

public class _06_Dizi {
    public static void main(String[] args) {
        int sayi=5;// bir tane saklıyor

        int sayi1;
        int sayi2;
        int sayi3;


        int[] dizi=new int[10];// 10 tane sayı tutuyor

        dizi[0]=5;
        dizi[1]=7;
        //...
        //...
        //...
        dizi[9]=45;

        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println(i + " Sayı Giriniz :");
            dizi[i] = oku.nextInt();
        }
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println((i+1)+" . sayi " + dizi[i]);

            String cumle="Bugün hava güzel";

            String[] kelimeler=cumle.split(" ");
            for (int j = kelimeler.length; j <=0  ; j--) {
                System.out.println(kelimeler[i]);

            }

        }

        }


    }

