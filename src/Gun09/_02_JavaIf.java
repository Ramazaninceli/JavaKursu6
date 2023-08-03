package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayının negatif mi, pozitif mi olduğunu yazdırınız
        //sıfır ise sıfır yazacak

        Scanner gir= new Scanner(System.in);

        System.out.print("sayı gir : ");

        int sayi= gir.nextInt();

        if (sayi<0)
            System.out.println("sayı negatiftir");
        if (sayi>0)
            System.out.println("sayı pozitiftir");
        if (sayi==0)
            System.out.println("sayı eşittir sıfır");

    }

}
