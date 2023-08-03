package Gun25._Odev;

import java.util.LinkedHashSet;

public class SETS_2DArrayListOdev_4 {
    public static void main(String[] args) {


//        4- removing() isminde bir method oluşturun.
//
//        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//
//                Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//
//        Return tipi linkedhashset
//
//                Örneğin,
//
//        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//
//        String 1= Germany
//
//        String 2 = USA
//
//                **Germany ve USA 'i sil.**
//
//        Set'i döndür.

        LinkedHashSet<String> hs1=new LinkedHashSet<>();
        hs1.add("Germany");
        hs1.add("France");
        hs1.add("USA");
        hs1.add("Canada");
        hs1.add("Mexico");
        hs1.add("Brasil");
        String str1="Germany";
        String str2="USA";

        System.out.println("önceki hali = " + hs1);
        LinkedHashSet<String> guncel=removing(hs1,str1,str2);
        System.out.println("sonraki hali = " + guncel);

    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> hs1 , String str1, String str2){

    hs1.remove(str1);
    hs1.remove(str2);

    return hs1;
    }

}
