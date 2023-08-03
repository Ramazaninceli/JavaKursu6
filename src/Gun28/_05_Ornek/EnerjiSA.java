package Gun28._05_Ornek;

import java.util.Scanner;

public class EnerjiSA {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);


        int ay=1;
        int cevap;
        int toplam=0;

        do {
            System.out.print(ay+".ay tüketilen enerjiyi girin: ");
            cevap=okuInt.nextInt();
            toplam=toplam+cevap;
            ay++;
        }while (ay<=3);
        //4. adım
        Musteri mus1=new Musteri();
        mus1.name="Ramazan ince";

        mus1.elektrikHesabı.tuketimEkle(toplam);


        System.out.println(mus1.name+" elektrikHesabı toplamTuketim = " + mus1.elektrikHesabı.toplamTuketim+" kW");

       mus1.elektrikHesabı.faturaYaz();






    }
}
