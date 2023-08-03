package Gun15;

import java.util.Scanner;

public class _11_Alistirma {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("1. Stringi giriniz :");
        String str1= oku.nextLine();

        System.out.print("2. Stringi giriniz :");
        String str2= oku.nextLine();

          boolean esitMi=str1.toLowerCase().equals(str2.toLowerCase());
        System.out.println(str1+" ve "+str2+" eşit mi " + esitMi);



    }
}
