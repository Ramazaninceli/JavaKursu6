package Gun09;

import java.util.Scanner;

public class _01_JavaaIf {
    public static void main(String[] args) {
        //kbaklava dilimimizin adı if

        //Girilen bir sayı 10 dan büyük ise ekrana 10 dan büyük yazdırınız
        //1- başla  {
        //2- sayı oku  sayi=oku.nextInt();
        //3- sayı >10 ise "10 dan büyük yaz" if(sayi>10
        //4-Dur

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı = ");

        int sayi= oku.nextInt();

        if (sayi>10)// normal parantez şart
        { // if in şartı sağlandığında çalışacak bölüm
            System.out.println("10 dan büyük");
            System.out.println("Program bitti");
        }
        //{} süslü parantezleri her zaman kullanabilirsiniz.
        //ancak if şartı sağlandığında çalışacak tek bir komut var ise
        // kullanmak zorunlu değildir.
    }
}
