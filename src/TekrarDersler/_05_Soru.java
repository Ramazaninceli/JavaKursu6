package TekrarDersler;

public class _05_Soru {
    public static void main(String[] args) {

        // cümleyi tersten yazdırınız
        String cumle="Bugün hava güzel";
        for (int i = cumle.length()-1;i>= 0 ; i--) {
            System.out.print(cumle.charAt(i));

        }

        // bir cümlede aranan bir harf kaçkez kullanılıyor
        char arananHarf='b';
        int tekrarSayisi=0;
        for (int i = 0; i <cumle.length() ; i++) {

//            String aranan=Character.toString(arananHarf);
//            String cumleninHarfStringi=Character.toString(cumle.toUpperCase().charAt(i));

           String aranan =arananHarf+"";
           String cumleninHarfString=cumle.toUpperCase().charAt(i)+"";


            if (cumleninHarfString.equalsIgnoreCase(aranan))
                tekrarSayisi++;

        }
        System.out.println("tekrarSayisi = " + tekrarSayisi);

        //bu gün hava güzel, güzel hava gün bu yazdırabilir miyiz


    }
}
