package Gun28._03_Ornek;

public class Book {
    String name;
    int publishYear;
    String author;
//sağ tıklayıp generate secerek constructureyi seçip nesneler seçilip oluşturulabiliri
    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }
    //sağ tıklayıp generate secerek constructureyi seçip nesneler seçilmeden oluşturulabiliri
    public Book() {
    }
    //sağ tıklayıp generate secerek constructureyi seçip nesneler seçilip oluşturulabiliri
    public Book(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }
    //sağ tıklayıp generate secerek constructureyi seçip tostring seçilip oluşturulabiliri
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
