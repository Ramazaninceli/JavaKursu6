package Gun25._Odev;

import java.util.ArrayList;
import java.util.HashSet;

public class SETS_2DArrayListOdev_3 {
    public static void main(String[] args) {

//          3-      commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//
//        return tipi arraylist olmalı.
//
//**ÖRNEĞİN:**
//
//        İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//
//        İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//
//        Ortak değerleri ArrayListe ekleyiniz.
//
//        çıktı:  "Germany" , "Brazil" ,"USA"
//
//        ArrayListi yazdırınız.


        HashSet<String> hs1=new HashSet<>();
        hs1.add("Germany");
        hs1.add("England");
        hs1.add("South Africa");
        hs1.add("Brasil");
        hs1.add("USA");

        HashSet<String> hs2=new HashSet<>();
        hs2.add("Germany");
        hs2.add("China");
        hs2.add("Brasil");
        hs2.add("France");
        hs2.add("USA");

        ArrayList<String> Ortaklar=commonValues(hs1,hs2);
        System.out.println("Ortak elemanlar = " + Ortaklar);
    }

    public static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2){
        ArrayList<String> Ortaklar=new ArrayList<>();
        for (String eleman: hs1) {
            if (hs2.contains(eleman)){
                Ortaklar.add(eleman);
            }
        }
        return Ortaklar;

    }


}
