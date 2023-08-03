package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız

        Scanner oku= new Scanner(System.in);

        System.out.print("sayı1 gir : ");
        int sayi1= oku.nextInt();

        System.out.print("sayı2 gir : ");
        int sayi2=oku.nextInt();

        int toplam= sayi1+sayi2;
        System.out.println("Toplam = "+toplam);



    }
}
