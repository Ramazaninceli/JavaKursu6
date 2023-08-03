package Gun05;

import java.util.Scanner;

public class _ScannerOdev9 {
    public static void main(String[] args) {
        //9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        float boy=oku.nextFloat();
        System.out.println("Boyunuz = " + boy);
    }
}
