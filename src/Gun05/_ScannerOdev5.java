package Gun05;

import java.util.Scanner;

public class _ScannerOdev5 {
    public static void main(String[] args) {
        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("10 yıl önce yaşadığın şehri girin : ");

        String sehir= oku.nextLine();
        System.out.println("sehir = " + sehir);
    }
}
