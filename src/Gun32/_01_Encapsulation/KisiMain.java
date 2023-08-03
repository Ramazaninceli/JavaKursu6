package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

    Kisi kisi1=new Kisi();
    
    kisi1.setAd("Ramazan");
    kisi1.setSoyad("ince");
    kisi1.setYas(-25);

        System.out.println("kisi1.getAd() = " + kisi1.getAd());
        System.out.println("kisi1.getSoyad() = " + kisi1.getSoyad());
        System.out.println("kisi1.getYas() = " + kisi1.getYas());

        //Değişkene direk erişimi kapatıp
        //bir metod ile korumalı veri gönderme ve alma
        // işlemine Encapsulation(kapsulleme) denir.
        // yani set ile veriyi alıp kontrol ederiz.
        // get ile okuruz


    }
}
