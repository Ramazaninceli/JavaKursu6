package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının  tek mi çift mi olduğnu yazdırınız.

        Scanner oku =new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int sayi= oku.nextInt();

        if (sayi%2==0)
            System.out.println(+sayi +"  sayısı çifttir  " );
        else// 0 değilken yani 1 veya -1 durumunda
            System.out.println(+sayi +"  sayısı tektir");
    }
}
