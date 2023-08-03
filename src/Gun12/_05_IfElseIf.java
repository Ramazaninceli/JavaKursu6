package Gun12;

import java.util.Scanner;

public class _05_IfElseIf {
    public static void main(String[] args) {
        //Soru: kullanıcıdan Fizik:90 şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Dersi ve notu giriniz :");
        String dersVeNot= oku.nextLine();
        
       //1. yöntem
        int ind=dersVeNot.indexOf(":");
         int ogrNot=Integer.parseInt(dersVeNot.substring(ind+1));
        System.out.println("ogrNot 1 = " + ogrNot);


        //2. yöntem regex : 0-9 un dışındakileri(^) sil demek

        ogrNot=Integer.parseInt(dersVeNot.replaceAll("[^0-9]",""));
        System.out.println("ogrNot2 = " + ogrNot);

        if (ogrNot>=90)
            System.out.println("A");
        else if (ogrNot>=80)
        System.out.println("B");
        else if (ogrNot>=70)
            System.out.println("C");
        else if (ogrNot>=60)
            System.out.println("D");
        else if (ogrNot>=40)
            System.out.println("E");
        else
            System.out.println("F");


    }
}
