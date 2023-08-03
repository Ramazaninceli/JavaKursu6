package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        int sayi=5; // tek rakam saklayabilen bir değişken
        int[] dizi= new int[20]; // 20 adet sayı saklayabilen bir değişken uzunluk sabit her bir hücresinde bir sayı var

        int[][] tablo=new int[20][2];//20 satır 2 sutünü var,  40 sayı saklar uzunluk sabit herbir hücrede bir dizi var
                                        // her bir satırda 10  sayı olan bir dizi var.

        ArrayList<Integer> liste=new ArrayList<>();// her bir satır(hücresi) integer bir sayı saklayabilecek atıldıkça,
                                                    // integeren listi, uzunluk değişken

        ArrayList<Integer> matNotları=new ArrayList<>();
        ArrayList<Integer> fizNotları=new ArrayList<>();
        ArrayList<Integer> kimNotları=new ArrayList<>();

        matNotları.add(50);
        matNotları.add(70);
        matNotları.add(80);

        fizNotları.add(51);
        fizNotları.add(60);

        kimNotları.add(52);
        kimNotları.add(70);
        kimNotları.add(80);
        kimNotları.add(90);
        //ArrayList lerin ArrayList i

       ArrayList<ArrayList<Integer>> tumNotlar=new ArrayList<>();
       tumNotlar.add(matNotları);
        tumNotlar.add(fizNotları);
        tumNotlar.add(kimNotları);

        tumNotlar.get(0);// matematik notlarını verir.
        tumNotlar.get(0).get(0);//matematik notlarının ilkini verir
        System.out.println("tumNotlar.get(0) = " + tumNotlar.get(0));//mat notları veriyor
        System.out.println("tumNotlar.get(1) = " + tumNotlar.get(1));//fiz notları veriyor
        System.out.println("tumNotlar.get(2)= " + tumNotlar.get(2));//kim notları veriyor

        // ilk mat notu
        System.out.println("tumNotlar = " + tumNotlar.get(0).get(0));

        // satırı yazdırmak için
        for (int i = 0; i < tumNotlar.size() ; i++) {
            System.out.println("tumNotlar.get(i) = " + tumNotlar.get(i));

        }
    //satır ve sutunu yazdırmak için
        for (int i = 0; i < tumNotlar.size() ; i++) {
           for (int j = 0; j < tumNotlar.get(i).size() ; j++) {
           System.out.println("tek tek notlar = " + tumNotlar.get(i).get(j));
        }
    }

    }
}
