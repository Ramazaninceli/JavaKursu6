package Gun02;

public class _05_EscapeCharacters {

    public static void main(String[] args) {



        // \n -> yeni satır aç demek alt satıra geç
        // \t -> tab tuşuna bas, 2,3 haraflik boşlik oluşturur.
        // \b -> backspace bir karakter geri siler
        // \" -> çift tırnağı ekrana yazdırır.
        // \\ -> ekrana birtane \ yazar.
        // \r -> satır başına git. dijital saatte kullanacağız

        System.out.println("MerhabaDünya"); // MerhabaDünya
        System.out.println("Merhaba\nDünya");// Merhaba yazar, sonra alt satıra geçen Dünya yazar
        System.out.println("Merhaba\tDünya"); // Merhaba    Dünya (tab tuşu kadar boşluk bırakır.
        System.out.println("Merhaba\bDünya"); //MerhabDünya a harfi silindi
        System.out.println("Merhaba\b\bDünya"); //MerhaDünya ba harfleri silindi
        System.out.println("Merhaba\"Dünya"); //Merhaba"Dünya tırnak eklendi
        System.out.println("Merhaba\\Dünya"); //Merhaba\Dünya tek slaş eklendi
        System.out.println("Merhaba\rDünya"); //Dünya Merhaba silindi



    }
}
