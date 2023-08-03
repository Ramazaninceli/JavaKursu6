package Gun30._StaticVariablesOrnek1.Ornek02;

public class Student {

   private int Id; // nesne

    String fullName;//nesne

   private static  int sayac=1; // kime ait: class a ait

    //sen bitanesin.
    // static olmadan herzaman 1 le başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.


    public Student(int id, String fullName) {
        Id = id;
        this.fullName = fullName;
    }

    public Student(String fullName) {
        this.fullName = fullName;
        this.Id=sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
