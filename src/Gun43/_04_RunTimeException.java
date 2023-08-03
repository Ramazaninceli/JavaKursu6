package Gun43;

import java.util.Scanner;

public class _04_RunTimeException {
    public static void main(String[] args) {

        boolean dogruCalisti;
        do {


            try {// hata bölgesine şeriti çektik
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayı1= ");
                int sayi1 = oku.nextInt();

                System.out.print("Sayı2= ");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;

                System.out.println("bolum = " + bolum);
                dogruCalisti = true;
            } catch (Exception exception) {//hata olursa yakala ve aşağıdaki bölümü çalıştır
                //hata mesajlarını hata isimli Exception cinsinden değişkene attım
                System.out.println("hata oluştu");
                System.out.println("exception = " + exception.getMessage());
                System.out.println("Lütfen 2. sayıyı 0 vermeyiniz");
                dogruCalisti = false;
            }
        }
        while (!dogruCalisti);
    }
}
