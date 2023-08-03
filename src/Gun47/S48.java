package Gun47;

import java.util.ArrayList;

public class S48 {
    public static void main(String[] args) {

        ArrayList<String> colors =new ArrayList<String>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");//siliniyor
        colors.add("yellow");
        colors.remove(2);//red silindi
        colors.add(3,"ciyan");// 3. indexe ekliyor,
        System.out.println("colors = " + colors);
        //colors.add(5,"ciyan"); indexoutofBoundsexection hatası verir.
        // çünkü arada boşluk oluyor. en son 3. indexe ekleme yapıldı

    }
}
