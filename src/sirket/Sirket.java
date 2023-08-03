package sirket;

public class Sirket {

    // 1 - Adım : person isimli bir class tanımlayınız : name, surname,age
    // 2 - Adım : mainde 2 tane bu sığıtan nesne oluşturup değer atayınız.

    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    public static void main(String[] args) {

        Person person1=new Person();
        person1.name="Ramazan ";
        person1.surName="ince";
        person1.age=43;

        Person person2=new Person();
        person2.name="Betül";
        person2.surName="ince";
        person2.age=37;

        System.out.println( person1.getBirthYear());
        System.out.println(person2.getBirthYear());

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);






    }
}
