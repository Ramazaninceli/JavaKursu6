package Gun32._02_Soru;

public class ArabaFields {

    private String renk;
    private int model;
    private int motorHacmi;
    private int kapiSayisi;


    public ArabaFields() {
    }

    public ArabaFields(String renk, int model, int motorHacmi, int kapiSayisi) {
//        this.renk = renk;
//        this.model = model;
//        this.motorHacmi = motorHacmi;
//        this.kapiSayisi = kapiSayisi;
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);
    }

    @Override
    public String toString() {
        return "ArabaFields{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {

        if (model>=0)
               this.model = model;
        else
            System.out.println("hatalı giriş");
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {

        if (motorHacmi>=1000)
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {

        if (kapiSayisi<7)
        this.kapiSayisi = kapiSayisi;
        else
            System.out.println("Hatalı giriş");
    }


}
