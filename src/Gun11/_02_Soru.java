package Gun11;

import java.util.Scanner;

public class _02_Soru {

    public static void main(String[] args) {
    //otopark üçretleri:
    //3 saate kadar 10tl , 5 saate kadar 15 tl, saat 5 den fazla ise 20 tl  dir.
    //kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("kaç saat kaldınız  :");
        int saat= oku.nextInt();

        if (saat<=3)
        System.out.println("toplamUcret = 10 tl " );

        else
        {
            if (saat<=5)
                System.out.println("toplam ücret = 15tl");
            else
                System.out.println("toplam ücret = 20tl");

        }


    }
}
