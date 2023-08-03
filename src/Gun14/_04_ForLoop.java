package Gun14;

public class _04_ForLoop {
    public static void main(String[] args) {
        //1 den 5 e kadar olan sayıları ekrana yazdırınız.
        

        int sayac=1;
        while (sayac<=5){
            System.out.println("sayac while = " + sayac);
            sayac++;
        }
        
        // döngünün kaç kere döneceği belli ise 
        // sayacın başlangıç değeri belli, artış değeri belli, şartı belli ise bi güzellik yapıp döngüyü basitleştirelim

        
        //başı belli sonu belli artışı belli ise : FOR DÖNGÜSÜ kullan
        for ( sayac=1; sayac<=5; sayac++){

            System.out.println("sayac For = " + sayac);
        }
        
        
        //Döngülerle ilgili  sonuç özeti
        // 1 - kaç kere döneceği belli ise : For döngüsü
        //2 - kaç kere döneceği belli değil ise : while veya doWhile
        // kontrol başta ise While, kontrol sonda ise doWhile kullanacağız.
        
    }
}
