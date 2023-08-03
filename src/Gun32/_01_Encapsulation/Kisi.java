package Gun32._01_Encapsulation;

public class Kisi {

   private String ad;
   private String soyad;

    private  int yas;



    public void setAd(String ad){
       if (ad.length()<25)
           this.ad=ad;
       else
           System.out.println("Hatalı giriş");

    }
    public void setSoyad(String soyad){
        if (soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("Hatalı giriş");

    }

    public void setYas(int yas) {

        if (yas<0)
            System.out.println("Hatalı giriş");
        else
            this.yas=yas;
    }

    public int getYas(){
        return this.yas;
    }

    public String getAd(){
        return this.ad;
    }


    public String getSoyad(){
        return this.soyad;
    }


}
