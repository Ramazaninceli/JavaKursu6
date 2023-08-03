package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMap {
    public static void main(String[] args) {

        Map<Integer, String> hm=new HashMap<>();//Map lerde HashMap
        hm.put(9,"tilki");
        hm.put(12,"karga");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");

        System.out.println("hm = " + hm);//hızlı çalışmak için, kendisine göre sıralı

        Map<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");

        System.out.println("lhm = " + lhm);// eklenme sırasına göre sıralı

        Map<Integer,String> thm=new TreeMap<>();
        thm.put(9,"tilki");
        thm.put(2,"kedi");
        thm.put(30,"köpek");
        thm.put(11,"kuş");
        thm.put(4,"kurt");

        System.out.println("thm = " + thm);// herzaman sıralı, kendinden sortlu




    }
}
