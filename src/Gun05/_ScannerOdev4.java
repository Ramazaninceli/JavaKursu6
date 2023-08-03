package Gun05;

import java.util.Scanner;

public class _ScannerOdev4 {
    public static void main(String[] args) {
        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("arabanızdaki kapı sayısını girin : ");
        int kapiSayisi=oku.nextInt();
        System.out.println("Aracın kapı Sayısı = " + kapiSayisi);

    }
}
