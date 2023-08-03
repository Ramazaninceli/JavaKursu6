package Gun28._05_Ornek;

import java.util.ArrayList;

public class Musteri {
    String name;//1. adım

    //3. adım
    ElektrikHesabı elektrikHesabı=new  ElektrikHesabı();


    public Musteri() {
    }

    public Musteri(String name, ElektrikHesabı elektrikHesabı) {
        this.name = name;
        this.elektrikHesabı = elektrikHesabı;
    }
}
