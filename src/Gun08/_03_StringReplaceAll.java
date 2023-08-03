package Gun08;

public class _03_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll : replace gibi çalışır farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzerli ipadeler
        //TODO(yapılacak) : ödev regex olarak neler yazılabiliyor google dan araştırılacak

        String text="Merhaba1 Dünya234";
        System.out.println("text = " + text);
        System.out.println("abn yi _ yap = " + text.replaceAll("[abn]","_"));
        //a,b,n leri alt çizgi yap demektir

        System.out.println("A-Z arasını _ yap) = " + text.replaceAll("[A-Z]","_"));
        //A-Z YE KADAR HARFLERİ  _ YAP _erhaba1 _Ünya234
        System.out.println("0-9 arasını sil = " + text.replaceAll("[0-9]",""));
        //0-9 arasını sil demek ->Merhaba dünya

        System.out.println("0-9 dışındakilerini sil = " + text.replaceAll("[^0-9]",""));
        //0-9 un dışındakileri sil -> 1234

        System.out.println("A-Z arasını ve a-z arasını sil) = " + text.replaceAll("[A-Z]","").replaceAll("[a-z]",""));
       // ü harfi türkçe karakter olması nedeniyle silme yada değiştirme yapmıyor. türkçe karakterleri tek tek yazıp silmek gerekiyor

    }
}
