package Gun19;

public class _04_JavaMethod {

    //metodların yazılabileceği yer

    public static void main(String[] args) {// ana metod, diğer metodlardan buranın içinde çarılacak

        int enb=Math.max(5,6);// max metodu değer/le almış, geriye büyük vermiş
        double rndSayi=Math.random();//hiçbir şey almıyor , sadece veriyor
        System.out.println("Merhaba Dünya");// veri alıyor, götürüp ekrana yazıyor
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");


        merhabaYaz();//kullanımı kolay , çagırması kolay, tekrar tekrar kullanabilirsin
        merhabaYaz();// main sade olacağı için daha anlaşılır olur
        merhabaYaz();//fonksiyonu çagırma şekli, temiz kod mantığı için

    }
    public static void merhabaYaz(){
        System.out.println("Merbaha dünya : Metoddan");
    }
}
