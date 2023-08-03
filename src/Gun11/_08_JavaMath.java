package Gun11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {
        // math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int sayi1= oku.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int sayi2= oku.nextInt();
        System.out.print("3. sayıyı giriniz : ");
        int sayi3= oku.nextInt();
         //1. yöntem
        int enbuyuk=Math.max(sayi1,sayi2);
        int enb=Math.max(enbuyuk,sayi3);
        System.out.println("enbüyük sayı = " + enb);

        // 2. yöntem
        System.out.println("en büyük sayı : " +Math.max(sayi1,Math.max(sayi2,sayi3)));

    }
}
