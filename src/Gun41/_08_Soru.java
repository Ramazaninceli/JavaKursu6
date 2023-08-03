package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class _08_Soru {
    static int interval;
    static Timer timer;
    public static void main(String[] args) throws InterruptedException {
        // TODO 1: Şu anki saati alınan saati geriye doğru saniye saniye saydırınız.
        // TODO 2: kullanıcıdan alınan saati geriye doğru saniye saniye saydırınız.
        // 19:35:56  formatındaki
        int i=-1;
while (true) {
    LocalTime now = LocalTime.of(01,01,10);
    DateTimeFormatter f =DateTimeFormatter.ofPattern("hh.mm.ss");
     System.out.print("\r" + now.plusSeconds(i--).format(f));
     Thread.sleep(1000);

     if (now.equals("00,00,00"))
         System.out.println("now = " + now);
        break;
}

/*       Scanner sc =new Scanner(System.in);
        System.out.print("saniye gir=>: ");

        String secs=sc.nextLine();

        int delay=1000;
        int period=1000;
        timer=new Timer();
        interval=Integer.parseInt(secs);
        System.out.print("secs =\r " + secs);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.print("\r"+setInterval());
            }
        } , delay,period);


    }
    private  static final int setInterval(){
        if (interval==1)
            timer.cancel();
        return --interval;*/

        //son tarih ayarla
       // LocalTime saat=LocalTime.of(00,00,00);

    }
}
