package Gun09;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığını bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir cümle girin : ");
         String cumle= oku.nextLine();

         cumle=cumle.toLowerCase();//bütün büyük harfler küçük oldu

        if (cumle.contains("a"))
            System.out.println("VAR");

        if (!cumle.contains("a"))
            System.out.println("yok");








    }
}
