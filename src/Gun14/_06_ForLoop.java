package Gun14;

import java.util.Scanner;

public class _06_ForLoop {
    public static void main(String[] args) {
        //kullanıcının gireceği bir rakama (dahil) kadar
        //olan sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaça kadar toplanacak :" );
        int rakam= oku.nextInt();


        int toplam=0;

        for (int i=1;i<=rakam;i++){
            toplam=toplam+i;
        }
        System.out.println("toplam = " + toplam);
    }
}
