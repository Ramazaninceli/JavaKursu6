package Gun18;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo = { //2 satır, 3 sütun new[2][3] (2satır 3 sutun)
                {2, 3, 44}, //1. satır 3 elemanlı
                {45, 66, 5} // 2. satır 3 elemanlı
        };
        System.out.println(Arrays.toString(tablo[0]));// 0. satırın tümü
        System.out.println(Arrays.toString(tablo[1]));// 1. satırın tümü
        System.out.println("tablo[0].lenght=" + tablo[0].length);//0.satırın uzunluğu
        System.out.println("tablo[0].lenght=" + tablo[1].length);//1.satırın uzunluğu

        System.out.println("tablo = " + tablo.length); //kaç satır var , satır uzunluğu

        for (int satir=0;satir<tablo.length;satir++) { //0,1

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)//her bir satırın sütunlarını yazdıran for
                System.out.print(tablo[satir][sutun] + " ");//alt alta yazdırmak için Println olacak

            System.out.println();
        }

    }
}