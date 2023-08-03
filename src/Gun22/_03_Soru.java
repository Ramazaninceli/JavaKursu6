package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        ArrayList<Integer> matNotları = new ArrayList<>();
        ArrayList<Integer> fizNotları = new ArrayList<>();
        ArrayList<Integer> kimNotları = new ArrayList<>();

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

        ArrayList<ArrayList<Integer>> tumNotlar = new ArrayList<>();
        tumNotlar.add(matNotları);
        tumNotlar.add(fizNotları);
        tumNotlar.add(kimNotları);

        //soru 1:
        //Notları ekrana ders adlarını bir ArrayListen alarak her dersin adını ve notlarını
        //her bir satıra yazdırınız
        //Matematik : 50 70 80
        //Fizik : 30 40
        //kimya : 60 70 80 90

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i <tumNotlar.size() ; i++) {
            System.out.print(dersler.get(i)  + " : ");

            for (int j = 0; j <tumNotlar.get(i).size() ; j++) {
                System.out.print(tumNotlar.get(i).get(j)+"\t");

            }
            System.out.println();

        }


        // Soru 2:
        // kullanıcıdan istediği bir dersin nosunu alarak(0-Mat, 1-Fiz, 2-Kim)
        //sadece istediği derse ait notları bir metodda yazdırınız

        System.out.println("************** 2. soru *********************************");
        // (0-Mat, 1-Fiz , 2-Kim)
        //ders oku


        Scanner oku= new Scanner(System.in);
        System.out.print(" (0-Mat, 1-Fiz , 2-Kim) :");
        int dersNo=oku.nextInt();

        dersNotlariniYazdir(dersNo,tumNotlar);

        //TODO
        // Soru 3:
        // yukarıda verilen derse ait not ortlamasını ve geçen sayısın bir metodda yazdırınız.
         }

    public static void dersNotlariniYazdir(int dersNo,ArrayList<ArrayList<Integer>> tumNotlar){

        for (int i = 0; i < tumNotlar.get(dersNo).size(); i++) {

            System.out.print(tumNotlar.get(dersNo).get(i) + "\t");

        }


    }


}
