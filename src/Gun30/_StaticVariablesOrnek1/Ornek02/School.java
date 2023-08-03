package Gun30._StaticVariablesOrnek1.Ornek02;

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

    }
}
