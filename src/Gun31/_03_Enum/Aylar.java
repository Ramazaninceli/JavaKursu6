package Gun31._03_Enum;

public enum Aylar {

    Tanimsiz(0,0,""),
    OCAK(1,31,"Ocak"),
    ŞUBAT(2,28,"Şubat"),
    MART(3,31,"Mart"),
    NİSAN(4,30,"Nisan"),
    MAYIS(5,31,"Mayıs"),
    HAZIRAN(6,30,"Haziran"),
    TEMMUZ(7,31,"temmuz"),
    AGUSTOS(8,31,"Ağustos"),
    EYLÜL(9,30,"Eylul"),
    EKIM(10,31,"Ekim"),
    KASIM(11,30,"Kasım"),
    ARALIK(12,31,"Aralık"),
    ;

   final int ayNo;
    final int gunMiktari;
    final String ayAd;

    Aylar(int ayNo, int gunMiktari, String ayAd) {
        this.ayNo = ayNo;
        this.gunMiktari = gunMiktari;
        this.ayAd = ayAd;
    }
}
