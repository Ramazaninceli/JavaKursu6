package Gun10;

import java.util.Scanner;

public class _07_IfElseOdev {
    public static void main(String[] args) {
        //1-
      // yan yana aralarında bir boslukla girilen 2 int sayının
      // birbirine eşit olup olmadığını bulunuz
      // 45 67   gibi
        /*Scanner oku=new Scanner(System.in);
        System.out.print(" aralarında boşluk olan 2 sayı giriniz :");
        String sayi= oku.nextLine();


        int boslukindex=sayi.indexOf(" ");
        String sayi1=sayi.substring(0,boslukindex);
        String sayi2=sayi.substring(boslukindex+1);
        int sayint1=Integer.parseInt(sayi1);
        int sayint2=Integer.parseInt(sayi2);

        if (sayint1==sayint2)

        System.out.println("sayılar eşit " );
        else
        System.out.println("sayılar eşit değil ");*/






// 2- yan yana aralarında bir boslukla girilen 3 int sayının
// toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
// 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print(" aralarında boşluk olan 3 sayı giriniz :");
        String sayi= oku.nextLine();


        int ilkBoslk=sayi.indexOf(" ");
        int ikinciBoslk=sayi.indexOf(" ",ilkBoslk+1);


        String sayi1=sayi.substring(0,ilkBoslk);
        String sayi2=sayi.substring(ilkBoslk+1,ikinciBoslk);
        String sayi3=sayi.substring(ikinciBoslk+1);

        int sayint1=Integer.parseInt(sayi1);
        int sayint2=Integer.parseInt(sayi2);
        int sayint3=Integer.parseInt(sayi3);

        System.out.println("s1  "+sayint1);
        System.out.println("s2  "+sayint2);
      System.out.println("s3  "+sayint3);

        int toplam=sayint1+sayint2+sayint3;

        if (toplam%2==0)
            System.out.println("toplam çifttir");
        else
            System.out.println("toplam tektir");


//
//
//        int sayint1=Integer.parseInt(sayi1);
//        int sayint2=Integer.parseInt(sayi2);
//       int sayint3=Integer.parseInt(sayi3);
//
//        System.out.println("s1  "+sayint1);
//        System.out.println("s2  "+sayint2);
//       System.out.println("s3  "+sayint3);

//        int toplam=sayint1+sayint2;
//
//        if (toplam%2==0)
//            System.out.println("toplam çifttir");
//        else
//            System.out.println("toplam çifttir");


//        Scanner input=new Scanner(System.in);
//        System.out.print(" enter up to three words separadet by commas :");
//        String phrase= input.nextLine();
//
//        String word1="";
//        String word2="";
//        String word3="";
//
//        int firstComma = phrase.indexOf(",");
//
//        if (firstComma>=0){
//            word1=phrase.substring(0,firstComma);
//            int secondComma=phrase.indexOf(",",firstComma+1);
//            if (secondComma>=0) {
//                word2 = phrase.substring(firstComma + 1, secondComma);
//                word3 = phrase.substring(secondComma + 1);// to end
//            }else {
//                word2=phrase.substring(firstComma+1);//to end
//
//            }
//        }else {
//            word1=phrase;
//        }
//        word1=word1.trim();
//        word2=word2.trim();
//        word3=word3.trim();
//
//        System.out.println("word1 = " + word1);
//        System.out.println("word2 = " + word2);
//        System.out.println("word3 = " + word3);




    }
}
