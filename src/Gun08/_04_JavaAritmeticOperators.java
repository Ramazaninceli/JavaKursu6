package Gun08;

public class _04_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b sonucu = " + (a+b));

        System.out.println("Çıkarma işlemi");
        System.out.println("a-b sonucu = " + (a-b));

        System.out.println("Çarpma işlemi");
        System.out.println("axb sonucu = " + (a*b));

        System.out.println("Bolme  işlemi");
        System.out.println(" int a/b sonucu = " + (a/b));

        // normal sonuc 1,8 fakat bilgisayar 2 si de tam sayı tipinde ise küsüratı atar
        // bu sebeple sonuç 1 olur, yuvarlama yapmaz int/int = int
        //küsüratlı sonuç istiyorsan işleme girenlerden en az birisi double olmalı

        System.out.println(" double a/b sonucu = " + ((double)a/b));

        /*************************/

        System.out.println("Modül işlemi : bölümünden kalan demek"); // 10/3-> bölüm 3 kalan 1 dir

        System.out.println("a%b =" +a%b);// bölüm 1 kalan 4 tür
        System.out.println("b%a =" +b%a); // bölüm 0 kalan 5 tir.







    }
}
