package Gun05;

import java.util.Scanner;

public class _ScannerOdev1 {
    public static void main(String[] args) {
        //1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.

        Scanner oku=new Scanner(System.in);

        System.out.print("isminizi giriniz : ");
        String isim= oku.nextLine();

        System.out.println("isim = " + isim);
    }


}


