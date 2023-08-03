package Gun26._02_Ornek;

import java.util.ArrayList;

public class Sirket {
    public static void main(String[] args) {
        // 1 - Adım : person isimli bir class tanımlayınız : name, surname,age
        // 2 - Adım : mainde 2 tane bu sığıtan nesne oluşturup değer atayınız.

        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        Person person1=new Person();
        person1.name="Ramazan";
        person1.surName="ince";
        person1.age=43;

        Person person2=new Person();
        person2.name="miraç";
        person2.surName="ali";
        person2.age=7;
        //1.yöntem
        System.out.println("1.yol");
        System.out.println("Adı  " + person1.name+"  Soyadı "+person1.surName+" Yaşı "+person1.age);

        //2. yöntem
        System.out.println("2.yol");
        BilgiYazdir(person1);
        BilgiYazdir(person2);

        //3. yol
        System.out.println("3. yol");
        person1.bilgiYazdir();
        person2.bilgiYazdir();

        //4. yol
        System.out.println("4. yol");
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);

        System.out.println("person2 = " + person2.toString());
        person1.getBirthYear();
        person2.getBirthYear();

        System.out.println(person1.getBirthYear2()+"\n"+
        person2.getBirthYear2());

}

public static void BilgiYazdir(Person personel){
    System.out.println("personel.name = " + personel.name);
    System.out.println("personel.name = " + personel.surName);
    System.out.println("personel.name = " + personel.age);
}
}


