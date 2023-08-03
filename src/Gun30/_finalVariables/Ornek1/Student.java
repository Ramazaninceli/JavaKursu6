package Gun30._finalVariables.Ornek1;

public class Student {

   final int Id; // nesne
    //değiştirilemez
    //yani sadece 1 kez veri atama şansı var.

    String fullName;//nesne

   private static  int sayac=1; // kime ait: class a ait

      public Student(int id, String fullName) {
        this.Id = id;
        // final değişkenlerine sadece 1 kez veri atanabilir.
          // oda ya tanımlanırken , ya da Constructurda
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
