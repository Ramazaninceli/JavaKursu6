package Gun12;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {
        //Girilen 2 tamsayıyı kullanıcıdan aldıktan sonra,
        //Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullnıcıdan alarak isteğe uygun olan
        //işlemi yaptırıp sonucu yazdırınız.

        Scanner oku =new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        System.out.print("ilk sayıyı gir :");
        int sayi1= oku.nextInt();


        System.out.print("ikinci sayıyı gir :");
        int sayi2= oku.nextInt();

        System.out.println("Toplama için T ");
        System.out.println("Çıkarma için Ç ");
        System.out.println("Çarpma için  P ");
        System.out.println("Bölme için   B ");

        System.out.print("Seçiminiz    = ");
        String secim= okuStr.next();

        // merdivenli if, ladder if
        if (secim.equalsIgnoreCase("T"))// egualsIgnoreCase ile büyük küçük harf  zorunluluğu ortadan kalkar
            System.out.println("Toplam = " + (sayi1+sayi2));
         else
          if (secim.equalsIgnoreCase("Ç"))
            System.out.println("Çıkarma = " + (sayi1-sayi2));
           else
            if (secim.equalsIgnoreCase("P"))
            System.out.println("Çarpma = " + (sayi1*sayi2));
             else
              if (secim.equalsIgnoreCase("P"))
               System.out.println("Bölme = " + ((double)sayi1/sayi2));
                else
                 System.out.println("Hatalı giriş");




    }
    }

