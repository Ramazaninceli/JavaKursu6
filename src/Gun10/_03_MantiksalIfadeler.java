package Gun10;

import java.util.Scanner;

public class _03_MantiksalIfadeler {
    public static void main(String[] args) {
        //mantıksal ifadeler Logic statement
        //&& ve işareti (shift 6) and işareti
        // || veya işareti (altgr <) or işareti

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı =");
        int sayi= oku.nextInt();

        //int kalan=sayi%2;

        if (sayi%2==1 || sayi%2==-1) // 1 veya -1 ken
            System.out.println("tektir");
        else // 0 olma durumu
            System.out.println("çifttir");
    }
}
