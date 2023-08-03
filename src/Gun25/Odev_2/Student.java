package Gun25.Odev_2;

public class Student {

    private int schoolNo;
    private String fullName;
    private int grade;

    public Student(int schoolNo, String fullName, int grade) {
        this.schoolNo = schoolNo;
        this.fullName = fullName;
        this.grade = grade;
    }

    public int getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(int schoolNo) {
        this.schoolNo = schoolNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolNo=" + schoolNo +
                ", fullName='" + fullName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
