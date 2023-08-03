package Gun25._Odev;

import java.util.ArrayList;

public class SETS_2DArrayListOdev_5 {
    public static void main(String[] args) {

//        5- 2D ArrayList
//
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//
//        Store all the elements in one arraylist and print the arraylist
//
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//
//                **Örnek:**
//
//```
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]

        int[][] dizi={{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        for (int[] eleman1:dizi ) {
            for (int eleman2:eleman1 ) {
                System.out.print( eleman2+" ");
            }
            System.out.println();

        }
        ArrayList<Integer> dizi2=new ArrayList<>();
        for (int[] eleman3:dizi ) {
            for (int eleman4:eleman3 ) {
                dizi2.add(eleman4);

            }
            
        }

        System.out.println("Sonraki hali = " + dizi2);
    }
}
