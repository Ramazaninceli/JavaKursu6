package Gun13;

import java.util.Scanner;

public class _02_Switch {
    public static void main(String[] args) {
        // girilen bir sayınını birler basamağının değerini yazı ile yazdırınız.
        //234 -> birler basamağı -> dört

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı gir =");

        int sayi= oku.nextInt();

        //234%10

        int birlerBasamagı =sayi%10;



        switch (birlerBasamagı){
            case 0 : System.out.println("sıfır"); break;
            case 1 : System.out.println("bir"); break;
            case 2 : System.out.println("iki"); break;
            case 3 : System.out.println("üç"); break;
            case 4 : System.out.println("dört"); break;
            case 5 : System.out.println("beş"); break;
            case 6 : System.out.println("altı"); break;
            case 7 : System.out.println("yedi"); break;
            case 8 : System.out.println("sekiz"); break;
            case 9 : System.out.println("dokuz"); break;

            default:
                System.out.println("Hatalı giriş");
        }


    }
}
