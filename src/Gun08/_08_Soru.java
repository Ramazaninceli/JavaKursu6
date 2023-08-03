package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // kullanıcıdan gireceği 2 sayının birbirine  eşit mi olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz = ");
        int sayi1= oku.nextInt();

        System.out.print("2. sayıyı giriniz = ");
        int sayi2= oku.nextInt();

        boolean esitMi = sayi1==sayi2;

        System.out.println("esitMi = " + esitMi);


    }
}
