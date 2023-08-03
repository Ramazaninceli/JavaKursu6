package Gun08;

public class _01_StringReplace {
    public static void main(String[] args) {
        // replace: bir stringin içindeki karakter(leri) verilenle değiştirir. hepsini

        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replace a e değişimi= " + text.replace("a","e"));//Merhebe Dünye
        System.out.println("text ba de değişimi = " + text.replace("ba","de"));//Merhade Dünya
        System.out.println("text.replace Merhaba Hello değişimi = " + text.replace("Merhaba","Hello"));
        System.out.println("text.replace a nın silinmesi = " + text.replace("a",""));// a lar silinir
    }
}
