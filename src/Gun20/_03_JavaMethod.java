package Gun20;

import Tools.MyFunc;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        //kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        //yaptıktan sonra main de yazdırınız



        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz :");
        int sayi1= oku.nextInt();

        System.out.print("2. sayıyı giriniz :");
        int sayi2= oku.nextInt();

        int enb=enbBul(sayi1,sayi2);
        System.out.println("enb = " + enb);

        enb= MyFunc.enbBul(sayi1,sayi2);//Myfunc
        System.out.println("enb = " + enb);

        int rndSayi=MyFunc.rndTamsayi(10);

    }
    public static int enbBul(int s1 , int s2){//metodun imzası

        int enb=0;
        if (s1>s2)
            enb=s1;
        else
            enb=s2;
        return enb;

//        // 2. yöntem
//
//        if (s1>s2)
//            return s1;
//        else
//            return s2;
//
//
//        //3. yöntem
//        return (s1>s2 ? s1 :s2);


    }

}
