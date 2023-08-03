package Gun05;

import java.util.Scanner;

public class _ScannerOdev2 {
    public static void main(String[] args) {
        // 2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın

        Scanner oku =new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int sayi= oku.nextInt();

        System.out.println("sayi = " + sayi);


    }
}
