package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {

        String bagis1="500";//kelime
        String bagis2="1500";//kelime

        //bana toplam bağış miktarı bul

        //int toplam1= bagis1+bagis2; bu şekilde toplama yapılamaz yapmak için
        // Integer.parseInt(bagis1) ile sayıya dönüştürmüş oluruz.

       //bunların int yani rakama dönüşmesi lazım

        int rakambagis1=Integer.parseInt(bagis1);
        int rakambagis2=Integer.parseInt(bagis2);
        int toplam= rakambagis1+rakambagis2;

        System.out.println("toplam = " + toplam);

    }
}
