package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //kullanıcıdan adını  ve soyadını alarak ekrana yazdırınız.

        Scanner oku=new Scanner(System.in); // okuma işlemini yapacak olan değişkeni tanımlar
        System.out.print("adınızı giriniz :");

        String AdSoyad = oku.nextLine();// okuma işlemi bu noktada yapılıyor

        System.out.println("Adız Soyadınız = " + AdSoyad);
        System.out.println("bitti");

    }
}
