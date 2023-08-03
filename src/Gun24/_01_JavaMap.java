package Gun24;

import java.util.HashMap;

public class _01_JavaMap {

        public static void main(String[] args) {
            // Set -> HashSet, LinkedHashSet, TeeSet
            // Map-> HashMap, LinkedHashMap, TeeMap
            //Map -> anahtar + Set -> anahtarlı Set (Tekrar eden anahtarlar yok)

          // anahtarın tipi Integer, değerin tipi Stirin
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001, "ismet temur");
        hm.put(1002, "ramazan ince");
        hm.put(2001, "buğrahan yılmaz");
        hm.put(5001, "Yusuf yılmaz");
        hm.put(1002, "Elife sözen");
        
        System.out.println("hm = " + hm);

        System.out.println("hm.get(1001) = " + hm.get(1001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(5002) = " + hm.containsKey(5002));

        System.out.println("hm.keySet() = " + hm.keySet());//keyleri toplu verir
        System.out.println("hm.values() = " + hm.values());// değerler toplu verir

        hm.remove(5001);
        System.out.println("hm = " + hm);
    }
}
