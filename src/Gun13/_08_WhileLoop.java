package Gun13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan gireceği 5 sayıdan tek olanlarının toplanın bulunuz

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;

        while (sayac<=5){
            System.out.print(sayac  + " .sayı : ");
            int sayi= oku.nextInt();

            if (!(sayi%2==0))
                toplam=toplam+sayi;
            sayac++;

        }
        System.out.println( "tek sayı Toplamı "+ toplam);


    }
}
