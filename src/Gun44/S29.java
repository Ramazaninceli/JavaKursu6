package Gun44;

public class S29 {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5};//1,3,5 yazılması isteniyor
        for (int e = 1; e <5 ; e+=2) {
            System.out.print( a[e]);
            //indexler 0,2,4 olmalı

            System.out.println();
            //2 ve 4 yazması için
            for (int b = 1; b <5 ; b+=2) {
                System.out.print( a[e]);
            }
            
        }
    }
}
