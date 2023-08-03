package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {

        // bir dikdörtgenin gerekli kenar(int) uzunluklarını kullanıcıdan
        // isteyip çeresini ve alanını bulunuz ve yazdırınız.
                // cevre = (a+b)*2
        // alan = a*b


        Scanner oku=new Scanner(System.in);

        System.out.print("kısa  kenar ölçüsünü gir : ");
        int kenarks= oku.nextInt();

        System.out.print("uzun  kenar ölçüsünü gir : ");
        int kenaruzn= oku.nextInt();

        int cevre= (kenarks+kenaruzn)*2;
        int alan=kenarks*kenaruzn;

        //1. yöntem tavsiye edilir
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

        //2. yöntem kullanışlı değil
        System.out.println("cevre = " +( kenarks+kenaruzn+kenaruzn+kenarks));
        System.out.println("alan = " +( kenarks*kenaruzn));




    }
}
