package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        //Girilen yeni bir  password un kurallara uygunluğunu kontrol ediniz.
        //kurallar:
        //1. en az 8 karakter olmalı
        //2. içinde pass kelimesi olmamalı(büyük/küçük)
        //3. en fazla 12 karakter olmalı

        Scanner oku=new Scanner(System.in);
        System.out.print("Passwor girin :");

        String sifre= oku.nextLine();

        if ((sifre.length()>=8 && sifre.length()<=12) && !sifre.toLowerCase().contains("pass"))
            System.out.println("Kurallara uygun");
        else
            System.out.println("kurallara uygun değil");
    }
}
