package Gun09;

import java.util.Scanner;

public class _00_Soru {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadığını yazdrırınız
        //true ya da false

        Scanner gir = new Scanner(System.in);

        System.out.print("bir sayı giriniz : ");

        int sayi= gir.nextInt();

        int kalan = sayi%2; //kalan 1 ise tektir

        // 1. yol
         boolean tekMi=(kalan==1);
        System.out.println("tekMi = " + tekMi);

        //2. yöntem
        System.out.println("tek mi= " + (kalan==1));


    }

}
