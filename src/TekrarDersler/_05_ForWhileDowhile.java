package TekrarDersler;

import java.util.Scanner;

public class _05_ForWhileDowhile {
    public static void main(String[] args) {

        // for while , do while
        // kaç kere döneceği belli ise bu for dur. sınırlar belli
        // kaç kere döneceği belli değilse bu While dongüsüdür
        //kontorl sondaysa do While

        Scanner oku=new Scanner(System.in);

       int toplam=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("sayı giriniz:");
            int sayi= oku.nextInt();
            toplam=toplam+sayi;

        }
        System.out.println("toplam = " + toplam);

        //************************
        //kullanıcı sıfır değeri girene kadar girilen sayıları toplayınız
        int sayi=1;
        int toplam1=0;
        while (sayi!=0){// döngünün devam şartı yazılıyor
            System.out.println("sayı giriniz While:");
            sayi= oku.nextInt();
            toplam1=toplam1+sayi;

        }
        System.out.println("toplam = " + toplam1);
        //****************************

        int sayi3=1;
        int toplam2=0;
        do {// döngünün devam şartı yazılıyor
            System.out.println("sayı giriniz DoWhile:");
            sayi3= oku.nextInt();
            toplam2=toplam2+sayi;

        }while (sayi3!=0);
        System.out.println("toplam = " + toplam2);
    }
}
