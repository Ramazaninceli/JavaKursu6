package Gun14;

import java.util.Scanner;

public class _02_DoWhileJava {
    public static void main(String[] args) {
        //kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        do { //bu döngö en az bir kez çalışır

            System.out.println(" sayı giriniz : ");
            sayi= oku.nextInt();

            toplam=toplam+sayi;


        }while (sayi !=0); // şart kontrolü sonda

        System.out.println("toplam = " + toplam);
    }
}
