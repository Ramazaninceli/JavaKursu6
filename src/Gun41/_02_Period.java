package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        // Period 2 tarih arasındaki farkı tutar
        // LocalDate ler için kullanılır

        LocalDate dogumTarihi= LocalDate.of(1978, 10, 25);
        LocalDate buGun= LocalDate.now();

        Period fark= Period.between(dogumTarihi, buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" Yaşındısınız.");

        /******************************************/
        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra= buGun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucGunSonra2= buGun.plusDays(3);
        System.out.println("ucGunSonra2 = " + ucGunSonra2);

        LocalDate ucAySonra = buGun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);

        System.out.println("*************************** ");
        // 1.Soru: Kursun bitiş tarihini bulunuz 6 ay : 15.05.2023
        LocalDate kursBaslagic= LocalDate.of(2023,5,15);
        Period kursSureG=Period.ofWeeks(6);
        Period kursSure= Period.ofMonths(6);
        LocalDate kursbitis= kursBaslagic.plus(kursSure);
        LocalDate kursZamani=kursBaslagic.plus(kursSureG);
        System.out.println("kursZamani 35 gün = " + kursZamani);

        System.out.println("kursbitis = " + kursbitis);
        System.out.println("kursbitis.günü = " + kursbitis.getDayOfWeek());

        //2.Soru : Kursun bitmesine nekadar süre kaldı ?
        Period neKadarSureKaldi= Period.between(buGun, kursbitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        //3.Soru : Ne kadar süredir devam ediyor
        Period suAnaKadarDevamSuresi= Period.between(kursBaslagic,buGun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);
    }
}
