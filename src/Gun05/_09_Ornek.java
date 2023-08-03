package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan ağırlıını double, boyunu doubel olarak alınız.
        // ve bir satırda boyunu.. ve kilonuz... kşeklinde yazınız.
        //vucut kitle indexini de bularak yazdırınız kg/(boy*boy)

        Scanner oku= new Scanner(System.in);

        System.out.print("Kilonuz(kg) : ");
         double kilo= oku.nextDouble();

        System.out.print("Boyunuz(m) : ");
        double boy= oku.nextDouble();

        System.out.println("boyunuz : "+boy+ "  Kilonuz : " +kilo);

        double vkindex= kilo/(boy*boy);
        System.out.println("Vucut kitle indexiniz = " + vkindex);


    }
}
