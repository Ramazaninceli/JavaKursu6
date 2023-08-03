package Gun06;

public class _04_StringCharAt {

    public static void main(String[] args) {
         //CharAt istenilen noktadaki karakteri verir

        String cumle="Merhaba Dünya"; // uzunluğu =13,  0-12 index

        int uzunluk = cumle.length();

        System.out.println("uzunluk = " + uzunluk);
       char ilkHarf= cumle.charAt(0);// 0 daki karakteri verir "M

        System.out.println("İlk harf = " + ilkHarf);

        // char 1 odalık yer tutar
        //String ise 1 dairelik kat yer tutar
    }
}
