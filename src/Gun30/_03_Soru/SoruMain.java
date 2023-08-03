package Gun30._03_Soru;

import java.util.Scanner;

public class SoruMain {
  public static void main(String[] args) {

//    int gun;
//    int saat;
//    int dakika;


    Scanner scanner=new Scanner(System.in);
    System.out.print("Gun = ");int gun=scanner.nextInt();
    System.out.print("Saat = ");int saat=scanner.nextInt();
    System.out.print("Dakika = ");int dakika=scanner.nextInt();

    System.out.println(" Toplam Saniye = " +Sabitler.hesap(gun,saat,dakika));







}
}