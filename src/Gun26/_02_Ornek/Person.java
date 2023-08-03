package Gun26._02_Ornek;

import java.util.Date;

public class Person {

    String name;
    String surName;

    int age;
    //field, propertis özellik demek

    public void bilgiYazdir(){
        System.out.println("adı: "+this.name);
        System.out.println("Soyadı : "+this.surName);
        System.out.println("Yaşı: "+this.age);
    }

    //yazdırılırken otomatik çağırılıyor
    public String toString(){// this.name kendi adımı demek
        String yazilacakYazi= "\n adı "+this.name+"\n soyadı "+this.surName+"\n yaşı "+this.age+"\n ";
        return yazilacakYazi;
    }

    public void getBirthYear(){
        System.out.println("Doğum yılı :"+(2023-this.age));

    }

    public int getBirthYear2(){
        int dogumYili=(2023 -this.age);
        return dogumYili;

    }
}
