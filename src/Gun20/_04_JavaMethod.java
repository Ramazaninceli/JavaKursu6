package Gun20;

import Tools.MyFunc;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöriyel)
        //bir fonksiyonda buldurup mainden yazdırınız.
        //örn 5 girildiyse -> 1*2*3*4*5 bulmalısınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi= oku.nextInt();

        int carpim= MyFunc.faktoryel(sayi);
        System.out.print("carpim = " + carpim);


    }
}
