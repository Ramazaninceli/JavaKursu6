package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //Kullanıcının gireceği bir cümlede kaç kelime olduğunu bulunuz
        //for döngüsü ile yapalım
        //bugün hava çok güzel ->5

        Scanner oku=new Scanner(System.in);

        System.out.print(" Bir cümle giriniz :");
        String cumle=oku.nextLine();

        int boslukSayisi=0;
        for (int i = 0; i <cumle.length(); i++) {

            if ((cumle.charAt(i))==' ')
              boslukSayisi++;

        }


        System.out.println("kelime sayısı = " + (boslukSayisi+1));
    }


}
