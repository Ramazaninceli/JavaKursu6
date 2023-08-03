package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 7  sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);

        int[] dizi=new int[7];//0123456

        double toplam=0;
        int miktar=0;

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print(i+1+ ". sayıyı giriniz :");
            dizi[i]=oku.nextInt();

            toplam=toplam+dizi[i];
        }
        double ort=toplam/dizi.length;

        for (int i = 0; i < dizi.length ; i++) {
            if ((dizi[i] >= ort) && !(dizi[i]%2==0))
                miktar++; // miktar=miktar+1 anlamına gelmektedir.

        }
        System.out.println("ortalama = " + ort);
        System.out.println("ortalamadan büyük olan tek sayı miktarı = " + miktar);

    }
}
