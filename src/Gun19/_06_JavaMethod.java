package Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        //verilen bir sayının tekmi çift mi olduğunu yazınız.

        int sayi=55;

        if (sayi%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");

        /*****************************/
        tekMiCiftMiYaz(20);
       tekMiCiftMiYaz(55);

       /***************************/
       OkutekMiCiftMiYaz();
    }
    public static void tekMiCiftMiYaz(int sayi){
        if (sayi%2==0)
            System.out.println(sayi+ " çifttir.m");
        else
            System.out.println(sayi+ " tektir.m");

    }

    public static void OkutekMiCiftMiYaz(){
        Scanner oku=new Scanner(System.in);

        System.out.print(" Sayı giriniz:");
        int sayi1= oku.nextInt();

        tekMiCiftMiYaz(sayi1);

    }
}
