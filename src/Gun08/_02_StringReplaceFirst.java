package Gun08;

public class _02_StringReplaceFirst {
    public static void main(String[] args) {
        // replaceFirst : bir string içindeki karakter(leri) verilenle değiştirir.
        // sadece ilkini yani ilk bulduğu yeri değiştiriyor
        
        String text = "Merhaba Dünya Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replaceFirst\"a\",\"e\") = " + text.replaceFirst("a","e"));//Merheba Dünya
        System.out.println("text.replaceFirst(\"ba\",\"de\") = " + text.replaceFirst("ba","de")); // Merhade Dünya
        System.out.println("text.replaceFirst(\"Dünya\",\"java\") = " + text.replaceFirst("Dünya","java"));
        System.out.println("text = " + text.replaceFirst("a",""));
    }
}
