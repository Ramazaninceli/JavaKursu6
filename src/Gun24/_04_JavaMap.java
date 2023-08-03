package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {
    public static void main(String[] args) {

        //Bir kartvizit uygulamasını 2 kişi için yapınız

        Map<String,String> ugurKartVizit=new HashMap<>();

        ugurKartVizit.put("isim","Uğur Yılmaz");
        ugurKartVizit.put("email","ugur@gmail.com");
        ugurKartVizit.put("adres","Çekmeköy/istanbul");
        ugurKartVizit.put("telefon","0505578878");

        System.out.println("ugurKartVizit.get(\"isim\") = " + ugurKartVizit.get("isim"));
        System.out.println("ugurKartVizit.get(\"email\") = " + ugurKartVizit.get("email"));

        Map<String,String> zaferKartVizit=new HashMap<>();

        zaferKartVizit.put("isim","zafer canlı");
        zaferKartVizit.put("email","zafer@gmail.com");
        zaferKartVizit.put("adres","ümraniye/istanbul");
        zaferKartVizit.put("telefon","05055785278");

        System.out.println("zaferKartVizit.get(\"isim\") = " + zaferKartVizit.get("isim"));
        System.out.println("zaferKartVizit.get(\"telefon\") = " + zaferKartVizit.get("telefon"));

        Map<String,Map<String,String>> kartVizitler=new HashMap<>();
        kartVizitler.put("uğur",ugurKartVizit);
        kartVizitler.put("zafer",zaferKartVizit);
// zaferin adresi
        System.out.println( kartVizitler.get("zafer").get("adres"));

        System.out.println( kartVizitler.get("uğur").get("email"));

//
        for (Map.Entry<String,Map<String,String>> kv:kartVizitler.entrySet()   )// entryset() keys +values
        {
            System.out.println("emailler " + kv.getValue());// tümünü yazdırır

            System.out.println("emailler " + kv.getValue().get("email"));//sadece mailleri yazdırır
        }






    }
}
