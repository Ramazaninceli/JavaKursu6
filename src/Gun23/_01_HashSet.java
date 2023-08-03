package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5; // hafzada sadece 1 sayi saklıyor
        int[] dizi=new int[6];// hafızada 6 sayı saklıyor: sabit boyutlu
        ArrayList<Integer> liste=new ArrayList<>();// boyu değişken , sınır yok

        //javacım, şu ana kadar verdiğin değişkenler için teşekkür ederim. bir çok işimi gördü,
        // bana öyle bir dizi tipi verki, içinde TEKRAR EDEN DEĞERLER olMASIN,
        // VE BAZEN İSTERSEN HER ZAMAN SIRALI OLSUN
        // BAZEN İSTERSEN EKLENDİĞİ SIRADA SIRALI OLUSUN
        // BAZZEN DE SEN OLABİLDİGİNDCE HIZLI ÇALIŞ
        // SIRA Önemli olmasın
        //sevgili Ramazan, sen hiç canını sıkma bu iş için tasarlanmış SET ler adını verdiğimiz özel diziler var.
        //HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sırada tutuyor.
        //LinkedHashSet -> sen ekledikçe eklenme sırasına göre tutuyor.
        //TreeSet -> sen ekledikce onları her zaman sıralı tutuyor.
        // Bunların ortak özelliği TEKRAR eden DEĞER YOK INDEX yok

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
       boolean eklendiMi= hs1.add(5);//tekrar eklendi acaba diziye kabul etti mi? false
        hs1.add(2);//tekrar eklendi acaba diziye kabul etti mi?

        System.out.println("hs1 = " + hs1);
        System.out.println("eklendiMi = " + eklendiMi);


    }
}
