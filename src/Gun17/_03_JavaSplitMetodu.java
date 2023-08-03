package Gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print(" Bir cümle giriniz :");
        String cumle=oku.nextLine();

        String[] kelimeler = cumle.trim().split(" ");//trim baş ve sondaki boşlukları siler .split ise Stringi boşluklara göre ayırırarak diziye dönüştürür.
       int kelimeSayisi = kelimeler.length;
        System.out.println("Kelime sayısı: " +kelimeler.length );
    }
}
//    iklimler çok  değişti
//
//        String[] kelimeler=cumle.split(" ");
//
//        kelimeler[0] -> "iklimler"
//        kelimeler[1] -> "çok"
//        kelimeler[2] -> "değişti"
//
//        kelime.length -> 3