package TekrarDersler;

public class _03_Stringİslemleri {
    public static void main(String[] args) {

        String tamAd="Ramazan ince";

        String isim=tamAd.substring(0,4);//0,1,2,3

        System.out.println("isim = " + isim);

        int boslukIndex=tamAd.indexOf(" ");
        System.out.println("boslukIndex = " + boslukIndex);

        isim=tamAd.substring(0,boslukIndex);
        System.out.println("isim = " + isim);

        String soyIsim=tamAd.substring(boslukIndex+1,tamAd.length());
        System.out.println("soyIsım = " + soyIsim);

        String soyIsim2=tamAd.substring(boslukIndex+1);// 2.değer yoksa sonuna kadar alır
        System.out.println("soyIsim2 = " + soyIsim2);

        System.out.println("tamAd = " + tamAd.charAt(tamAd.length()-1));// son karakteri almak için
    }
}
