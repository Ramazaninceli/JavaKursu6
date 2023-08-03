package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

   //LocalDate sadece gün ay yıl bilgisini tutar

        LocalDate tarih= LocalDate.now();// Şu andaki tarihi ver
        System.out.println("tarih = " + tarih);

        System.out.println("tarih = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());// ayın adı
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());//kaçıncı ay olduğu
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());//gün adı
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());// haftanın kaçıncı günü
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());//yılın kaçıncı günü

        System.out.println("******************************");

        // kandesindeki hazır formatlara bakalım, Windowsun yerel ayarlarına göre değişebilir.
        System.out.println("ISO_DATE="+tarih.format(DateTimeFormatter.ISO_DATE));// uluslar arası tarih
        System.out.println("SHORT ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

//istediğimiz formatta gösterim
        System.out.println("\n************ istediğimiz formatta gösterim ***************");
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih.dd/MM/yyyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter oze2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih.d.M.yy = " + tarih.format(oze2));

        DateTimeFormatter oze3=DateTimeFormatter.ofPattern("EEEE.dd.MM.yy");
        System.out.println("tarih.EEEE.dd.MM.yy = " + tarih.format(oze3));

        DateTimeFormatter oze4=DateTimeFormatter.ofPattern("EE.dd.MM.yy");
        System.out.println("tarih.EE.dd.MM.yy = " + tarih.format(oze4));

        DateTimeFormatter oze5=DateTimeFormatter.ofPattern("MMMM.EEEE.dd.MM.yyyy");
        System.out.println("tarih.MMMM.EEEE.dd.MM.yy = " + tarih.format(oze5));

        DateTimeFormatter oze6=DateTimeFormatter.ofPattern("MMMM dd EEEE.dd.MM.yyyy");
        System.out.println("tarih.MMMM.EEEE.dd.MM.yy = " + tarih.format(oze6));

        //DateTimeFormatter oze6=DateTimeFormatter.ofPattern("MMMM dd EEEE.dd.MM.yyyy");
        //kısaca aşağıdaki gibi de yazılabilir,
        System.out.println("tarih.MMMM.EEEE.dd.MM.yy = " + tarih.format(DateTimeFormatter.ofPattern("MMMM dd EEEE.dd.MM.yyyy")));

    }
}
