package Gun05;

import java.util.Scanner;

public class _ScannerOdev7 {
    public static void main(String[] args) {
        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //   Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir banka hesabınız var mı? : ");
        boolean varMı=oku.nextBoolean();
        System.out.println("varMı = " + varMı);

    }
}
