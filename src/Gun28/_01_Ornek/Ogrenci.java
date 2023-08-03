package Gun28._01_Ornek;

public class Ogrenci {

    int Id;
    String ad;
    String soyadi;
    int sinifi;


    //yapıcı metodlar:Constractor metodlar
    public Ogrenci(){
        System.out.println("nesne oluşturuludu");
    }
    //yapıcı metodlar:Constractor metodlar
    public Ogrenci(int id, String ad,String soyadi,int sinifi){

        this.Id=id;
        this.ad=ad;
        this.soyadi=soyadi;
        this.sinifi=sinifi;
    }

    //yapıcı metodlar:Constractor metodlar
    public Ogrenci(int id, String ad,String soyadi){

        this(id,ad,soyadi,0);// this=Ogrenci, kendisi

//        this.Id=id;
//        this.ad=ad;
//        this.soyadi=soyadi;
//        this.sinifi=0;
    }


}
