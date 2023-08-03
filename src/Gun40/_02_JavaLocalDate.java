package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {

    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();// Şu andaki tarihi ver

        DateTimeFormatter oze6=DateTimeFormatter.ofPattern("MMMM dd EEEE.dd.MM.yyyy");
        System.out.println("tarih.MMMM.EEEE.dd.MM.yy = " + tarih.format(oze6));

        //Localden aldığım tarihi başka dilde formatta gösterimi
        System.out.println("*****Başka dilde formatta gösterimi********");

        System.out.println("Alman = " +tarih.format(oze6.withLocale(Locale.GERMANY)));

        //Lokalizasyon tanımlaması ne demek
        // en-US : Amerakinın ingilizce konuşulan localizasyonu(bölgesi)
        // en-UK : İngilterenin ingilizce konuşulan localizasyonu(bölgesi)
        //en-UK : ingilterenin ingilizce koşulan localizasyonu(bölgesi)
        //fr-CA : kanadanın fransızca konuşulan localizasyonu(bölgesi)
        //en-CA : kanadanın ingilizce konuşulan localizasyonu(bölgesi)
        //tr_TR : Türkiyenin Türkçe konuşulan bölgesi

        Locale lCince = new Locale("zh","CH"); // Çinin zh konuşulan bölgesi
        System.out.println("çince = " +tarih.format(oze6.withLocale(lCince)));

        //Kullanılabilir localleri bulma
        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();


        for (Locale l: kullanilabilirLokaller) {

            if (!l.getDisplayCountry().toLowerCase().contains("tur")) continue;
            System.out.print("Dili" +l.getDisplayLanguage());
            System.out.print("Ülkesi " +l.getDisplayCountry());
            System.out.print(",Dili"+l.getLanguage());
            System.out.print(",Ülke" + l.getCountry());
            System.out.println();


        }
        System.out.println();
        Locale lTurkiye = new Locale("tr","TR");
        System.out.println("Türkçe Tarih : "+tarih.format(oze6.withLocale(lTurkiye)));

        System.out.println("\n*****************");
        //tarhi=2053-5-20; gibi kendimiz bir tarihi nasıl set ederiz.
        LocalDate tarih1= LocalDate.of(2053,5,20);
        LocalDate tarih2=LocalDate.of(2053, Month.MAY,20);
        System.out.println("tarih2.format(oze6) = " + tarih2.format(oze6));
        System.out.println("tarih1.format(oze6) = " + tarih1.format(oze6));

    }
}
