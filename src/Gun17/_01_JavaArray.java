package Gun17;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
        //50 elemanlı bir dizi tanımlayınız, 10a kadar olan sayılardan
        // Random atayarak doldurunuz. Sonrasınada ayrı bir döngü ile tek olanlar 1,
        // çift olaraka 0 atayınız yazdırınız


        int[] dizi=new int[50];//50 elemanlı bir dizi tanımladık

        for (int i = 0; i < dizi.length ; i++)
           dizi[i] = (int) (Math.random() * 10);//10 a kadar olan sayılardan random atayarak doldurduk

            for (int i = 0; i < dizi.length; i++)
                System.out.println("dizi önce = " + dizi[i]);//10 a kadar random olan sayıları yazdırdık

        for (int i = 0; i < dizi.length; i++){// çift ise 0

            if (dizi[i]%2==0)// çift ise
                dizi[i]=0;//0 yaz
            else //değilse
                dizi[i]=1;// 1 yaz yani tek olanlara 1 yaz
        }

        for (int i = 0; i < dizi.length; i++)
            System.out.println("dizi sonra = " + dizi[i]);// 1 ve 0 ataması yapıldıktan sonra yazdırma işlemi

    }




    }

