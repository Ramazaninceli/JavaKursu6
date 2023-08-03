package Gun14;

import java.util.Scanner;

public class _01_Konu1 {
    public static void main(String[] args) {
        //kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int toplam=0;

        System.out.println(" sayı giriniz : ");
        int sayi= oku.nextInt();
        toplam=toplam+sayi;


        int sayac=1;

        while ( sayi !=0){ // döngönün dönme şartı verilen sayının "0" dan farklı olması


            System.out.println(" sayı giriniz : ");
             sayi= oku.nextInt();

            toplam=toplam+sayi;



                

            
        }
        System.out.println("toplam = " + toplam);
    }
}
