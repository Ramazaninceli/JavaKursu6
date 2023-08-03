package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // girilen bir stringin uzunlugu 10 dan büyükse ve string içinde
        //study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        //hayır yazdırın

        Scanner oku=new Scanner(System.in);

        System.out.print("cümle giriniz :");
        String cumle= oku.nextLine();
//      Eger cumle 10 karaterden uzunsa VE study içeriyorsa
//          EVET yaz
//      değilse
//      HAYIR yaz

        if (cumle.length()>10 && cumle.toLowerCase().contains("study") )
            System.out.println("evet");
        else
            System.out.println("hayır");

        // cümlenin içinde ne geçiyorsa contains kullanılır
        // cümlenin içinde aynısı için equals kullanılır
    }
}
