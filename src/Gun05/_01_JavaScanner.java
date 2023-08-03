package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi    adı   başlangıc değeri
        //int       sayi=5;

        Scanner okuyucu= new Scanner(System.in);
        //tip     adı     yeni bir tane okuyucu oluştur.(klavyeden-konsoldan okusun)

        System.out.println("sayı giriniz=");

       int okunan= okuyucu.nextInt();// klavyeden girilen TAMSAYIYI OKU
        // rakam girilip entara basıldığında değeri alıp onunan a atışor

        System.out.println("okunan = " + okunan);
    }


}
