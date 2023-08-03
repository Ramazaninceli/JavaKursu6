package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        //SETS
        //HashSet : Hızlı , bu kendine göre olgoritmik sırada tutar.
        //LinkedHashSet : EKLENME SIRASI na göre sıralı tutar.
        //TreeSet :her zaman içinde SIRALI şekilde tutar, kendinden sortlu

        //HashSet : Hızlı , bunun için kendine olgoritmik sırada tutar.
        HashSet<String> hs=new HashSet<>();

        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("HashSet = " + hs);

        //LinkedHashSet : EKLENME SIRASI na göre sıralı tutar.
        LinkedHashSet<String> lhs=new LinkedHashSet<>();

        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("LinkedHashSet = " + lhs); //ekleme sırasına göre sıraladı

        //TreeSet :her zaman içinde SIRALI şekilde tutar, kendinden sortlu

        TreeSet<String> tr=new TreeSet<>();

        tr.add("bir");
        tr.add("iki");
        tr.add("üç");
        tr.add("dört");
        tr.add("beş");
        System.out.println("treeSet = " + tr); // alfabetik sıraladı
    }
}
