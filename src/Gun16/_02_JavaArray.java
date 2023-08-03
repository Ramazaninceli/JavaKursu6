package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //dizi nasıl okunur ve nasıl yazdırılır ?

        Scanner oku=new Scanner(System.in);

        int[] dizi=new int[10];// 10 elemanlı bir dizi tanımladık. indexi 0-9 arasıdır


        for (int i = 0; i < dizi.length ; i++) {
            System.out.print(i+1+ " sayı giriniz :");
            dizi[i]= oku.nextInt();//0,1,2,3,4,5,6,7,8,9

        }
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("dizi["+i+"] = " + dizi[i]);

        }







    }
}
