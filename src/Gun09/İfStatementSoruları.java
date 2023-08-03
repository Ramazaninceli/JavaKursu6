package Gun09;

import java.util.Scanner;

public class İfStatementSoruları {
    public static void main(String[] args) {
        //   1- Girilen bir sayının birler basamağını
        //   tek olup olmadığını ekrana yazdırınız.
//        Scanner oku =new Scanner(System.in);
//        System.out.print("sayı giriniz: ");
//        int sayi= oku.nextInt();
//
//        if (sayi%2!=0)
//            System.out.println("birler basamağı tektir");
//        if (sayi%2==0)
//            System.out.println("birler basamağı tek değil");

        /*****************************************/

//2- Kullanıcıdan vize ve final notunu alınız.
// ort = 0.4 * vize + 0.6 * final olarak bularak,
// 50 ve yukarısında ise geçtiniz , altında ise kaldınız yazdırınız.
//        Scanner oku=new Scanner(System.in);
//        System.out.print("vize notunuzu giriniz :");
//        int vize= oku.nextInt();
//        System.out.print("Final notunuzu girini :");
//        int finl=oku.nextInt();
//
//        double ort=vize*0.4+0.6*finl;
//
//        if (ort>=50)
//            System.out.println("geçtiniz");
//        if (ort<50)
//            System.out.println("kaldınız");

//3- Girilen bir cümle A harfi ile başlıyorsa ,
// EVET, başlamıyorsa HAYIR yazdırınız.

//        Scanner oku =new Scanner(System.in);
//        System.out.print("cümle giriniz :");
//        String cumle= oku.nextLine();
//        cumle=cumle.toUpperCase();
//        char basharf=cumle.charAt(0);
//        if (basharf=='A')
//            System.out.println("EVET " +basharf);
//        if (basharf!='A')
//            System.out.println("HAYIR " +basharf);

// 4- Kullanıcıdan 2 kere şifresini isteyiniz,
// aynı ise TAMAM, değil ise HATALI şifre yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Şifre giriniz :");
        String sifre1= oku.nextLine();
        System.out.print("Tekrar şifre giriniz :");
        String sifre2= oku.nextLine();

        if (sifre1.equals(sifre2)==true)
            System.out.println("TAMAM");
        if (sifre1.equals(sifre2)==false)
            System.out.println("HATALI");
    }
}
