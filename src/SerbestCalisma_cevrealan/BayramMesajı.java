package SerbestCalisma_cevrealan;

import java.util.Scanner;

public class BayramMesajı {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Bayramı kutlanacak kişinin adını yazınız: ");
        String isim=oku.nextLine();
        Mesaj(isim);

    }
    public static void Mesaj(String isim){

        System.out.println();
        System.out.println("\u001B[33m*********************************************\u001B[0m");
        System.out.println("\u001B[34m" + isim+ ","+"\u001B[0m");
        System.out.println("Kubraban Bayramının tüm sevdiklerinle birlikte huzur, mutluluk ve bereket getirmesini dileriz");
        System.out.println("\u001B[2m"+"\u001B[3m" + "\u001B[35m"+"Kurban bayramınız kutlu olsun"+"\u001B[0m");
        System.out.println("\u001B[1m" + "\u001B[31m" +"Techno Study"+"\u001B[0m" );
        System.out.println("\u001B[34m**********************************************\u001B[0m");

    }



}
