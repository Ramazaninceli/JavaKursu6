package Gun05;

import java.util.Scanner;

public class _ScannerOdev6 {
    public static void main(String[] args) {

    //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz : ");

        String gun= oku.nextLine();

        System.out.println("Doğum gunü = " + gun);
}
}