package Proje;

import java.util.Scanner;

public class _01_01_Proje {
    public static void main(String[] args) throws InterruptedException {

        Scanner consol=new Scanner(System.in);

        System.out.println("Hoş Geldiniz!");
        System.out.println("[1]Espresso");
        System.out.println("[2]Cappuccino");
        System.out.println("[3]Americano");
        System.out.println("[4]Cafe Latte");
        System.out.println("[5]Türk Kahvesi");
        System.out.println("[6]Caffee Macchiato");
        System.out.println("[7]Mocha");
        System.out.println("[8]Filtre Kahve");
        System.out.print("Hangi Kahveyi İstersiniz?"+" "+"(1-8)"+" :");

        int kahveSecimi=0;
        String kahve=" ";
       while (kahveSecimi<1 ||kahveSecimi>8){
           int kahvesecimi= consol.nextInt();
               switch (kahveSecimi){
                   case 1:kahve="Espresso";
                       System.out.println("Espresso hazırlanıyor...");
                       Thread.sleep(2000);
                       break;
                   case 2:kahve="Cappucino";
                       System.out.println("Cappucino hazırlanıyor" );
                       Thread.sleep(2000);
                       break;
                   case 3:kahve="Americano";
                       System.out.println("Americano hazırlanıyor...");
                       Thread.sleep(2000);
                       break;
                   case 4:kahve="Cafe Latte";
                       System.out.println("Caffe latte hazırlanıyor...");
                       Thread.sleep(2000);
                       break;
                   case 5:kahve="Türk kahvesi";
                       System.out.println("Türk kahvesi hazırlanıyor...");
                       Thread.sleep(2000);
                       break;
                   case 6: System.out.println(kahve+"Caffee Macchiato hazirlanıyor...");
                   Thread.sleep(2000);
                   break;
                   case 7: System.out.println(kahve+"Mocha  hazirlanıyor...");
                   Thread.sleep(2000);
                   break;
                   case 8: System.out.println(kahve+"Filtre kahve hazirlanıyor...");
                   Thread.sleep(2000);
                   break;
                   default:
                       System.out.print("Hatalı seçim yaptınız. Tekrar deneyiniz :");
                    break;
           }

        }

        consol.nextLine();
        System.out.println("süt içer misiniz (evet/hayır :");
        String sutSecimi= consol.nextLine();
        boolean sut=sutSecimi.equalsIgnoreCase("evet");
        if (sutSecimi.equalsIgnoreCase("evet")) {
            System.out.println("kahveniz sütlü hazırlanıyor...");
            Thread.sleep(2000);
        } else {
            System.out.println(" kahveniz sütsüz hazırlanıyor...");
            Thread.sleep(2000);
        }
    }
}
