package Gun25._Odev;

import java.util.HashSet;

public class SETS_2DArrayListOdev_02 {


//    2- changeSet() isminde bir method oluşturun.
//
//    Parametre olarak bir String HashSet   ve  iki String
//
//    return hashset olmalı
//
//    Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//
//            **ÖRNEK:**
//
//    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//
//    String 1 = **banana**
//
//    String 2 = **peach**
//
//            **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"



    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet<>();
        hs1.add("banana");
        hs1.add("strawberry");
        hs1.add("kiwi");
        hs1.add("pineapple");

        System.out.println("hs1 eski hali = " + hs1);

        System.out.println("hs1 son hali"+ changeSet(hs1,"banana","peach"));

    }


    public static HashSet changeSet(HashSet<String> set, String string1, String string2){

        if ((set.contains(string1))){
            set.remove(string1);
            set.add(string2);
        }
        return set;
    }


}
