package SerbestCalisma;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        HashSet<String> hs=new HashSet<>();
        hs.add("Bir");
        hs.add("iki");
        hs.add("üç");

        System.out.println("hs = " + hs);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("dört");
        lhs.add("Bir");
        lhs.add("iki");
        lhs.add("üç");

        System.out.println("lhs = " + lhs);

        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("aaa");
        System.out.println("ts = " + ts);



    }
}
