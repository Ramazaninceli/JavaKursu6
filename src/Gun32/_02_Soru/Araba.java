package Gun32._02_Soru;

public class Araba {
    public static void main(String[] args) {

        ArabaFields aracım=new ArabaFields();
        ArabaFields arabam=new ArabaFields("Mavi",1985,1200,9);
        System.out.println("arabam = " + arabam);

        aracım.setRenk("Beyaz");
        aracım.setModel(2013);
        aracım.setMotorHacmi(1300);
        aracım.setKapiSayisi(8);

        System.out.println("aracım = " + aracım.getRenk()+" renk\n"
                +aracım.getModel()+" Model\n" +aracım.getMotorHacmi()
                +" cc\n" + aracım.getKapiSayisi()+" adet kapısı var");







    }
}
