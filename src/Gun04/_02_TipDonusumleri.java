package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {

        byte ogrnot1=98;
        byte ogrnot2=98;
        byte ogrnot3=98;
        byte ogrnot4=100;
        //int             //byte
        int toplamNot=ogrnot1+ogrnot2+ogrnot3+ogrnot4;

        // int hafzadaki alanı daha büyük;

        System.out.println("toplamNot = " + toplamNot);

        ogrnot1= (byte) toplamNot; //394 ü byte alana atmaya çalışırsak challenger(uzay mekiği) patlama nedeni
        System.out.println("toplamNot = " + ogrnot1);
        // int -> byte atınca dur bakalım dedi (DARALTMA)
        // büyük hafıza ayrılmış bir alanı küçük haafıza ayrılmış alana atma işlemi var. veri kaybı ihtimali var.
        //ondalıklı birsayının sadece tam sayıkısmı gerekli olabilir
        //10/3=3  -> 10/(double)3-> 3,33
    }
}
