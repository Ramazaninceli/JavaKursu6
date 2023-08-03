package SerbestCalisma.Soru;

public class Banka {
    public static void main(String[] args) {


        
    Musteri mus1=new Musteri();
    mus1.musteriNo=1;
    mus1.name="Ramazan";
    mus1.surName="ince";
    
    mus1.musteriHesap.yatirilanPara(100);
    mus1.musteriHesap.yatirilanPara(200);
    mus1.musteriHesap.cekilenPara(50);

        System.out.println("mus1.musteriHesap = " + mus1.musteriHesap);
    
    
    
}
}