package SerbestCalisma;

import java.util.Scanner;

public class serbestCalisma {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Aklinizda tutarak ekrana devam yaziniz ");


        String cevap=oku.next();
        System.out.println("Tuttugunuz sayiyi 2 ile carparak ekrana devam yaziniz");
        String cevap2=oku.next();
        System.out.println("Islem sonucuna dilediginiz bir sayi ekleyerek 2 ye bolunuz ve eklediginiz sayiyi ekrana yaziniz ");
        int cevap3= oku.nextInt();
        System.out.println("sonuctan tuttugunuz sayi kadarini cikariniz ve ekrana devam yaziniz  ");
        String cevap4= oku.next();
        int sonuc=cevap3/2;
        System.out.println("kalan sayi= "+sonuc);


















    }



}
