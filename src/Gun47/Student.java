package Gun47;

public class Student {
    String name;
    public Student(String name){
        this.name=name;
    }

}

class Test_S103 {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        //students[0] karşılığı yani bir değeri hiç yok
        students[1] = new Student("richard");
        students[2] = new Student("donald");
        for (Student s : students) {
            System.out.println("" + s.name);//null name student[0] ın değeri olmadığından dolayı NullPointerException hatası veriyor.

        }
    }


}