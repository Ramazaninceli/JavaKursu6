package Proje._03_XOX;

import java.util.Scanner;

public class Xo_Oyun {

    public static void main(String[] args) {

    String[][] xo;
    boolean tekrarOynama, oyunKontrol, hamleKontrol;
    int hamle;

    xo = new String[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                xo[i][j]="*";
            }
        }
        System.out.println("1. oyuncu = X\n"
                +"2. oyuncu = O");
        do {
            do {
                XOGoster(xo);
                System.out.print("Hamle Sırası 1.oyuncuda : ");
              do {
                    hamle=HamleAl();
                    hamleKontrol=HamleKontrol(xo, hamle);
                    if (!hamleKontrol)
                    {
                        System.out.println("Lütfen geçerli bir hamle yapınız");
                        XOGoster(xo);
                    }
              }while (!hamleKontrol);
                xo=HamleYap(xo,hamle,"X");
                tekrarOynama=TekrarOynama(xo,hamle);
                oyunKontrol=OyunBittiKontrol(xo);
                if (tekrarOynama) System.out.println("Bir hak daha kazandınız.");
            }while (tekrarOynama && oyunKontrol);

            do {
                XOGoster(xo);
                System.out.print("Hamle Sırası 2.oyuncuda: ");
                do {
                    hamle=HamleAl();
                    hamleKontrol=HamleKontrol(xo, hamle);
                    if (!hamleKontrol)
                    {
                        System.out.print("Lütfen geçerli bir hamle yapınız");
                        XOGoster(xo);
                    }
                }while (!hamleKontrol);
                xo=HamleYap(xo,hamle,"O");
                tekrarOynama=TekrarOynama(xo,hamle);
                oyunKontrol=OyunBittiKontrol(xo);
                if (tekrarOynama) System.out.println("Bir hak daha kazandınız.");
            }while (tekrarOynama && oyunKontrol);

        }while (oyunKontrol);
        SonucGoster(xo);
    }

    public  static void XOGoster(String XO[][]){   //XO harfini göstermek için yu 2 boyutlu bir dizi içinde gösteriyoruz. matris
        System.out.print("\n");

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i==0 && j==0) || (i==1 && j==0) || (i==2 && j==0))
                    System.out.print(XO[i][j]); // xo nun iki boyutlu diziyi getir
                else
                    System.out.print("-" + XO[i][j]);
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    public static int HamleAl(){
    Scanner input =new Scanner(System.in);
    int sayi;
    sayi =input.nextInt();
    while (sayi<1 || sayi>9){
        System.out.println("Lütfen geçerli bir hamle yapınız.");
        sayi= input.nextInt();
          }
    return sayi;
}

    public static boolean HamleKontrol(String XO[][], int hamle){
        int satir, sutun;

        satir=hamle/3;
        if (hamle==3 || hamle==6 || hamle==9) satir--;

        sutun=hamle%3;
        if (sutun==0) sutun=2;
        else  sutun--;

        if (XO[satir][sutun].equals("*")) return true;
        else return false;


    }

    public static String[][]HamleYap(String XO[][], int hamle, String Oyuncu){
        int satir, sutun;
        Scanner oku =new Scanner(System.in);//ben girdim
        System.out.print("Satır gir.");//ben girdim
        satir= oku.nextInt();//ben girdim
        System.out.print("sutün gir.");//ben girdim
        sutun= oku.nextInt();//ben girdim
        satir=hamle/3;
        if (hamle==3 || hamle==6 || hamle==9) satir--;

        sutun=hamle%3;
        if (sutun==0) sutun=2;
        else  sutun--;

        XO[satir][sutun]= Oyuncu;
        return XO;
    }

   public static boolean TekrarOynama(String XO[][], int hamle){
       System.out.println((XO[0][0]+XO[0][1]+XO[0][2]));
       switch (hamle) {
           case 1:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][0] + XO[2][0]).equals("OOO")
                       || (XO[0][0] + XO[1][0] + XO[2][0]).equals("XXX"))
                   return true;
               else return false;
           case 2:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else return false;
           case 3:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][0] + XO[2][0]).equals("OOO")
                       || (XO[0][0] + XO[1][0] + XO[2][0]).equals("XXX"))
                   return true;
               else return false;
           case 4:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else return false;
           case 5:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][0] + XO[2][0]).equals("OOO")
                       || (XO[0][0] + XO[1][0] + XO[2][0]).equals("XXX"))
                   return true;
               else return false;
           case 6:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else return false;
           case 7:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][0] + XO[2][0]).equals("OOO")
                       || (XO[0][0] + XO[1][0] + XO[2][0]).equals("XXX"))
                   return true;
               else return false;
           case 8:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else return false;

           case 9:
               if ((XO[0][0] + XO[0][1] + XO[0][2]).equals("OOO")
                       || (XO[0][0] + XO[0][1] + XO[0][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][1] + XO[2][2]).equals("OOO")
                       || (XO[0][0] + XO[1][1] + XO[2][2]).equals("XXX"))
                   return true;
               else if ((XO[0][0] + XO[1][0] + XO[2][0]).equals("OOO")
                       || (XO[0][0] + XO[1][0] + XO[2][0]).equals("XXX"))
                   return true;
               else return false;


           default:
               break;
       }

    return true;
   }

   public static boolean OyunBittiKontrol(String XO[][]){
        int sayi=0;
       for (int i = 0; i <3 ; i++) {
           for (int j = 0; j <3 ; j++) {
               if (XO[i][j].equals("*"))
                   sayi++;
           }
       }
        if (sayi==0)
            return false;
        else
            return true;// true idi

   }

    public static void SonucGoster(String XO[][])
    {
        XOGoster(XO);
        int oyuncu1=0, oyuncu2=0;
        if ((XO[0][0] + XO[0][1]+XO[0][2]).equals("XXX")) oyuncu1++;
        if ((XO[1][0] + XO[1][1]+XO[1][2]).equals("XXX")) oyuncu1++;
        if ((XO[2][0] + XO[2][1]+XO[2][2]).equals("XXX")) oyuncu1++;
        if ((XO[0][0] + XO[1][0]+XO[2][0]).equals("XXX")) oyuncu1++;
        if ((XO[0][1] + XO[1][1]+XO[2][2]).equals("XXX")) oyuncu1++;
        if ((XO[0][2] + XO[1][2]+XO[2][2]).equals("XXX")) oyuncu1++;
        if ((XO[0][0] + XO[1][1]+XO[2][2]).equals("XXX")) oyuncu1++;
        if ((XO[0][2] + XO[1][1]+XO[2][2]).equals("XXX")) oyuncu1++;

        if ((XO[0][0] + XO[0][1]+XO[0][2]).equals("OOO")) oyuncu2++;
        if ((XO[1][0] + XO[1][1]+XO[1][2]).equals("OOO")) oyuncu2++;
        if ((XO[2][0] + XO[2][1]+XO[2][2]).equals("OOO")) oyuncu2++;
        if ((XO[0][0] + XO[1][0]+XO[2][0]).equals("OOO")) oyuncu2++;
        if ((XO[0][1] + XO[1][1]+XO[2][2]).equals("OOO")) oyuncu2++;
        if ((XO[0][2] + XO[1][2]+XO[2][2]).equals("OOO")) oyuncu2++;
        if ((XO[0][0] + XO[1][1]+XO[2][2]).equals("OOO")) oyuncu2++;
        if ((XO[0][2] + XO[1][1]+XO[2][2]).equals("OOO")) oyuncu2++;

        System.out.println("1. Oyuncunun Puanı:" + oyuncu1
                + "\n2. Oyuncunun Puanı: " +oyuncu2);

        if (oyuncu1>oyuncu2) {
            System.out.println("1. Oyuncu kazandı.");
        } else if (oyuncu1<oyuncu2)
        {
            System.out.println("2. Oyuncu kazandı.");
        }else
        {
            System.out.println("Oyun berabere.");
        }

    }
}
