package Gun30._finalVariables.Ornek1;

public class School {

    public static void main(String[] args) {
        Student ogr1=new Student(1,"ismet temur");
        Student ogr2=new Student(2,"mehmet yılmaz");
        Student ogr3=new Student(3,"beyza temur");
        // problem: hem id yi takip etmek zorundayım
        //hem de hata olasılığı yüksek

       Student ogr10=new Student("ismet");
        Student ogr11=new Student("mehmet");
        Student ogr12=new Student("ayşe");

        System.out.println("ogr10 = " + ogr10);//1
        System.out.println("ogr11 = " + ogr11);//2
        System.out.println("ogr12 = " + ogr12);//3

        //ogr10.id=5005;
        //student.sayac=5005;

        //ogr10.id=5005;
        //final değişkenlerine sadece 1 kez veri atanabilir
        // oda ya tanımlanırken yada Constructor da

    }
}
