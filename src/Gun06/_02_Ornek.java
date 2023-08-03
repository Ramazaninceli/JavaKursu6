package Gun06;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        // kullanıcıdan cadde, sokak, postakodu(ınt) ve ülke ev sahibi(b) şeklinde
        // adres bilgisini alarak yazdırınız.

        Scanner okustr =new Scanner(System.in);
        Scanner okuInt =new Scanner(System.in);
        Scanner okuBln =new Scanner(System.in);

        System.out.print("Cadde adını giriniz : ");
        String cadde =okustr.nextLine();

        System.out.print("Sokak adını giriniz : ");
        String sokak =okustr.nextLine();

        System.out.print("Posta kodunu giriniz : ");
        int postaKodu =okuInt.nextInt();

        System.out.print("Ülke adını giriniz : ");
        String ulke =okustr.nextLine();

        System.out.print("Ev sahibi misiniz :(True/False) ");
        boolean evSahip=okuBln.nextBoolean();

        System.out.print("Adres= " + cadde+ " "+  sokak +" "+ postaKodu+ " "+ ulke + " " +evSahip );




    }
}
