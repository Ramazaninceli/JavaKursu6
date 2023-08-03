package Gun31._03_Enum;

public class AylarMain {
    public static void main(String[] args) {


        Aylar ay = Aylar.AGUSTOS;
        System.out.println("ay = " + ay);
        System.out.println("ay.gunMiktari = " + ay.gunMiktari);
        System.out.println("ay.ayAd = " + ay.ayAd);

        for (Aylar a:Aylar.values()) {
            System.out.println(a.ayNo+".ay "+a.gunMiktari+" Gün olarak "+a.ayAd + " ayıdır.");

        }

    }
}