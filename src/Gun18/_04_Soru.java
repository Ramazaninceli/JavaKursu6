package Gun18;

public class _04_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        //bütün doldurma işlemi bittikten sonra
        //sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz.


        //2 ye 3 lük bir tabloyu
        int[][] tablo = new int[2][3];//2 ye 3 lük bir tablo


        //  tabloyu random 100 e kadar sayılarla doldurunuz
        for (int satir = 0; satir < tablo.length; satir++) { //satırları yazdıran for

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)//her bir satırın sütunlarını yazdıran for
                tablo[satir][sutun] = (int) (Math.random() * 100);//satır ve sutunlar için 100 sayı üret  ve doldur
        }

        // tobloyu yazdıralım
        for (int satir = 0; satir < tablo.length; satir++) { //satırları yazdıran for

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)//her bir satırın sütunlarını yazdıran for
                System.out.print(tablo[satir][sutun] + " ");//alt alta yazdırmak için Println olacak

            System.out.println();
        }
        //kaç tane tek sayı olduğunu bulunuz
        int tekSayiMiktar = 0;
        for (int satir = 0; satir < tablo.length; satir++) { //0,1

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)//her bir satırın sütunlarını yazdıran for

                if (!(tablo[satir][sutun] % 2 == 0))// veya  if ((tablo[satir][sutun] % 2 == 1))
                    tekSayiMiktar++;


        }
        System.out.println("tekSayiMiktar = " + tekSayiMiktar);
    }

}
