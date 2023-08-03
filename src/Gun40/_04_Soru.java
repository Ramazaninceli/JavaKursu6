package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Soru {
    //Canlı dijital saat yapınız.
    public static void main(String[] args) throws InterruptedException {

        //System.out.println("saat = " + saat);

        DateTimeFormatter f1= DateTimeFormatter.ofPattern("kk:mm:ss");


        while (true){
            LocalTime saat = LocalTime.now();
            System.out.print("\r"+saat.format(f1));//\r tekrarlamayı engeller
            Thread.sleep(1000);//1saniye beklemesini sağlıyor
        }


    }
}
