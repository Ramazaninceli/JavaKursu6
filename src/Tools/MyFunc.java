package Tools;

import java.util.Scanner;

public class MyFunc {
    public static int enbBul(int s1, int s2) {//metodun imzası

        int enb = 0;
        if (s1 > s2)
            enb = s1;
        else
            enb = s2;
        return enb;
    }

    public static int rndTamsayi(int sinir) {
        int rndSayi = (int) (Math.random() * sinir + 1);
        return rndSayi;
    }


    public static int faktoryel(int sayi) {
        int carpim = 1;
        for (int i = 1; i <= sayi; i++)

            carpim = carpim * i;

            return carpim;



    }



    public static void bekle(int sn)  {
        try {
            Thread.sleep(1000*sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    public static int rndTamsayi(int sinir)
//    {
//        int rndSayim=(int) (Math.random()*(sinir+1));
//        return rndSayim;
//    }


}


