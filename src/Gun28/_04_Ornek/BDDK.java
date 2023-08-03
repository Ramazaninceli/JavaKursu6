package Gun28._04_Ornek;

public class BDDK {

    public static void main(String[] args) {

        Banka bank1=new Banka();
        bank1.adi="ziraat";
        bank1.kurulusYili=1881;
        bank1.subeSayisi=1000;

        Banka bank2=new Banka("garanti",1900,800);
        Banka bank3=new Banka("garanti",2000);

        System.out.println("bank1 = " + bank1);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);


    }

}
