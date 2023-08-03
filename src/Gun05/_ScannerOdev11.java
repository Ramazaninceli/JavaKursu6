package Gun05;

import java.util.Scanner;

public class _ScannerOdev11 {
    public static void main(String[] args) {
        //11-Kullanıcdan alacağınız 3 öğrenci ders notunun ortalamasını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1. öğrencinin ders notu : ");
        double not1= oku.nextDouble();
        System.out.print("2. öğrencinin ders notu : ");
        double not2= oku.nextDouble();
        System.out.print("3. öğrencinin ders notu : ");
        double not3= oku.nextDouble();

        double ortalama=(not1+not2+not3)/3;

        System.out.println("ortalama = " + ortalama);

        // 

    }
}
