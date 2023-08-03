package Gun13;

public class _04_yeniKonu {
    public static void main(String[] args) {

        // Ekrana 5 kez merhaba yazdırınız.

        int sayac=1;
        while (sayac<=5)//iken yap:Şartı yazıyoruz, dönme şartını
            {
            //tekrarlanacak adımlar buraya yazılıyor
            System.out.println(sayac+ ". Merhaba");
            sayac=sayac+1;//2,3,4,5 sayac++, ++sayac şeklinde de yazılabilir.
        }
        System.out.println("Program bitti");


    }
}
