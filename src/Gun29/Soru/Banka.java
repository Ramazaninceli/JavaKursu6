package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {

        Musteri mus1=new Musteri();
        mus1.musteriNo=1;
        mus1.ad="Ramazan";
        mus1.soyad="ince";
        
        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println("mus1.musteriHesap = " + mus1.musteriHesap);

    }
}
