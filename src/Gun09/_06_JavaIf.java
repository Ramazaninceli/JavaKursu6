package Gun09;

import java.util.Scanner;

public class _06_JavaIf {

    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        //bulunuz geçiyor ise EVET, geçmiyorr ise HAYIR yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("bir cümle girin : ");
        String cumle= oku.nextLine();

        boolean varMı=cumle.contains("a");

        if (varMı==true)
            System.out.println("EVET");
        if (varMı==false)
            System.out.println("HAYIR");


// 2. yol
        if (cumle.contains("a")==true)
            System.out.println("EVET");
        if (cumle.contains("a")==false)
            System.out.println("HAYIR");

        //3.yol
        if (cumle.contains("a"))
            System.out.println("EVET");
        if (!cumle.contains("a")) // ! işareti değilse anlamında kullanılıyor
            System.out.println("HAYIR");

        // Alternatif
        cumle.contains("a");// a harfini içeriyor mu
        cumle.indexOf("a");//  a harfinin indexini verir (0-....) a içer miyor -1 verir

        if (cumle.indexOf("a")>=0) // != -1 eşit değil eksi 1
            System.out.println("evet");
        if (cumle.indexOf("a")<0) // < 0
            System.out.println("hayır");

    }
}
