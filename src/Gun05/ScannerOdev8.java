package Gun05;

import java.util.Scanner;

public class ScannerOdev8 {
    public static void main(String[] args) {
      //  8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Ağırlık giriniz (kg) : ");

        byte agirlik= oku.nextByte();

        System.out.println("agirlik = " + agirlik + "kg");


    }


}
