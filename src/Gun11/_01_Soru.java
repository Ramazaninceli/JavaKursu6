package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        //yan yana aralarında bir boşlukla girilen 2 int sayının
        //birbirine eşit olup olmadığını bulun
        //45 67

        Scanner oku=new Scanner(System.in);// ekrandan oku
        System.out.print(" aralarında boşluk olan 2 sayı giriniz :");//45 67 gibi
        String sayilar= oku.nextLine();

        int boslukindex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,boslukindex);//string
        String strSayi2=sayilar.substring(boslukindex+1);//string

        int sayint1=Integer.parseInt(strSayi1);//int
        int sayint2=Integer.parseInt(strSayi2);//int

        if (sayint1==sayint2)

        System.out.println("sayılar eşit " );
        else
        System.out.println("sayılar eşit değil ");
    }
}
