package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız sayılarla dolduracğınız 6 elemanlı(sayı) bir dizinin
        //sadece tek sayı olan elemanlarını ayrı diziye (liste(ArrayList)atayarak
        //yazdırınız


        Scanner oku=new Scanner(System.in);

        int[] dizi=new int[6];
        for (int i = 0; i < dizi.length; i++) {
                System.out.print("Enter a number: ");
                dizi[i] = oku.nextInt();   // değerleri alıyor

        }

        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        ArrayList<Integer> tekler=new ArrayList<>();
         for (int i = 0; i < dizi.length ; i++) {

                if ((dizi[i]%2!=0)) {// tek demek hem negatif hem pozitif 1 hem de -1
                    tekler.add(dizi[i]);
                }

        }
        System.out.println("tekler = " + tekler);

        /**************************************************************/
        //2.yöntem
        tekler.clear();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Enter a number: ");
            dizi[i] = oku.nextInt();   // değerleri alıyor

            if ((dizi[i]%2!=0)) {// tek demek hem negatif hem pozitif 1 hem de -1
                tekler.add(dizi[i]);
            }

        }
        System.out.println("tekler = " + tekler);

    }
}
