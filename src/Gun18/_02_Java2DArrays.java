package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        //
        int[] dizi=new int[10]; // 10 tane değer boş halde default 0
        int[] dizi2={2,3,45,67,8,8,99,0,44,2};//10 tane hem tanımlandı hem değer verildi.

        int[][] tablo=new int[2][3]; // 2 satır 3 sütün demektir. hepsi default 0 değerine sahiptir

        int[][] tablo2={ //2 satır, 3 sütun
                {2,3,44}, //1. satır 3 elemanlı
                {45,66,5} // 2. satır 3 elemanlı
        };
        //1. yöntem
        for (int satir=0;satir<2;satir++) { //0,1
            System.out.println(tablo2[satir][0]);// her bir satırın 0. elemanı
            System.out.println(tablo2[satir][1]);// her bir satırın 1. elemanı
            System.out.println(tablo2[satir][2]);// her bir satırın 2. elemanı
            System.out.println();
        }
        // 2 forlu yöntem kesin ve hatasız olan dır

        for (int satir=0;satir<2;satir++) { //0,1

            for (int sutun = 0; sutun < 3; sutun++)
                System.out.println(tablo2[satir][sutun] + " ");

            System.out.println();
        }
}
}