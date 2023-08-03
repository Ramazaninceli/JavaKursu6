package Gun44;

public class S23 {
    public static void main(String[] args) {
        // 30 değerini veren kod hangisidir.

        int[] stack ={10,20,30};
        int size=3;
        int idx=0;

       // System.out.println("A şıkkı");
//        do {
//            idx++;
//        }while (idx>=size);//1>=3 böyleyse dön, sonuç idx=1

        //System.out.println("B şıkkı");
//        while (idx<size){
//        idx++;//1,2,3 : sonuç idx=3 : HATA
//        }
        System.out.println("c şıkkı");
        do {
            idx++;

        }while (idx<size-1);

        //System.out.println("D şıkkı");

//        do {
//            idx++;
//
//        }while (idx<=size);// idx<=3 , sonuç. 4 facia

      //  System.out.println("e şıkkı");

//        while (idx<=size-1){//idx<=2
////        idx++;//en son idx=3 olur exception
////        }

        System.out.println("idx = " +stack[idx]);
    }


}
