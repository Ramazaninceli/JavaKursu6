package Gun05;

import java.util.Scanner;

public class _ScannerOdev3 {
    public static void main(String[] args) {
        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sevdiğiniz meyveyi giriniz : ");

        String meyve= oku.nextLine();
        System.out.println("Sevdiğiniz meyve = " + meyve);
    }
}
