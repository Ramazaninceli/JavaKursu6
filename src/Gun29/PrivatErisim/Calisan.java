package Gun29.PrivatErisim;

public class Calisan {
    int Id; // defaut erişim
    String name; // defaut erişim
    String surname; // defaut erişim
    private String password; // defaut erişim

    public void sifreAta(String sifre){

        if (sifre.length()<8)
            System.out.println("Zayıf Şifre");
        else {
            this.password=sifre;
            System.out.println("Şifre başarıyla atandı");
        }
    }

  public void sifreGoster()
  {

        System.out.println("****"+this.password.substring(4));
  }




}
