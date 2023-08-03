package Gun04;

public class _08_Ornek4 {
    public static void main(String[] args) {

        // int to String, rakamların yazıya çevrilmesi

        String ad= "Ramazan ince";
        int sinifNo=5;
        char subesi='A';
        boolean gectiMi=true;

        System.out.println(ad+sinifNo+ " "+subesi+" " +true);
        // + işaretinin herhangi bir tarafında string varsa diğer değişken otomatik string e dönüşür.

        System.out.println("Merhaba"+1+2+3);// işlem soldan sağa doğru gider çıktısı Merhaba123
        System.out.println(1+2+3+"Merhaba");// işlem soldan sağa doğru gider çıktısı 6Merhaba

    }
}
