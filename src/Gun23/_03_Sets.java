package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets
{
    public static void main(String[] args) {

        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");// tekrar ettiğinden dolayı eklenmedi
        renkler.add("RED");
        System.out.println("renkler = " + renkler);

        for (String eleman: renkler){// sıra garanti değil
            System.out.println("eleman = " + eleman);

        }
         // foreach

        Integer[] dizi={1,2,3,4,56};

        for (int eleman:dizi){
            System.out.println("eleman = " + eleman);
        }


        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(dizi));

        for (Integer elema: dizi){
            System.out.println("elema = " + elema);
        }


        //Set in kendi sırası nasıl ise onun aynısını verir.
        Iterator gosterge=renkler.iterator();
        
        while (gosterge.hasNext()){// sırada eleman varsa

            System.out.println("gosterge.next() = " + gosterge.next());
            //.Next gostergenin gösterdiği elemaın temsil ediyor


        }

    }
}
