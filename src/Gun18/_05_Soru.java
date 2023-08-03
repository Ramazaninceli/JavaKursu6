package Gun18;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //2*3 lük bir tabloyu random 10 a kadar sayılarla dodurunuz.
        // daha sonra kullunıcıdan bir sayı alınız.bu saıyı tabloda varsa
        // yerini(satir, sutun) yazdırınız.


        //2*3 lük bir tabloyu oluştururuz
        int[][] tablo=new int[2][3];

           //random 10 a kadar sayılarla dodurunuz
        for (int i = 0; i < tablo.length ; i++) {

            for (int j = 0; j < tablo[i].length ; j++)
                tablo[i][j]=(int) (Math.random()*10);
        }
        // ramdom sayıları yazdırınız
        for (int i = 0; i < tablo.length ; i++) {

            for (int j = 0; j < tablo[i].length ; j++)
                System.out.print(tablo[i][j]+ " ");;

            System.out.println();// boşluk
        }
        //kullanıcıdan sayı iste
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz :");
        int sayi= oku.nextInt();

        //girilen sayı ramdom sayılarda var mı.
        for (int i = 0; i < tablo.length ; i++) {

            for (int j = 0; j < tablo[i].length; j++)
                if (tablo[i][j] == sayi)
                System.out.println(" satır= "+i+ " sutun = " +j);

            System.out.println();

        }


        
    }
}
