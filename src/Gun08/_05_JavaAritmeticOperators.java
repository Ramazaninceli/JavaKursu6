package Gun08;

public class _05_JavaAritmeticOperators {
    public static void main(String[] args) {

        int sayac=0;
        sayac=sayac+1;//sayacın değerini bir arttırıyor. 1
        sayac++;    //sayacın değerini bir arttırıyor 2
        ++sayac;    // sayacın değerini bir arttırıyor 3

        sayac=sayac-1;// sayacın değerini bir azaltır. 2
        sayac--;        // sayacın değerini bir azaltır. 1
        --sayac;        // sayacın değerini bir azaltır. 0

        System.out.println("sayac = " + sayac);

        /********************************/

        int toplam=5+sayac;  // önce sayaç= 0 toplam= 0 sonra toplam =5, sayac =0
        toplam=0;
        toplam=5+sayac++; // önce sayac=0, toplam=0 sonra toplam= 5, sayac =1
        //toplam = 5+ sayac; sayac++;
        toplam=0;
        sayac=0;

        toplam=5+ ++sayac;
            // özet ++ lar sagda ise önce işlem sonra artış
            // ++ lar solda ise önce artış sonra işlem

        System.out.println("toplam = " + toplam);




    }
}
