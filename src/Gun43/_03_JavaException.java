package Gun43;

public class _03_JavaException {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");
        String kelime="";

        char harf=kelime.charAt(3);//Kelime değişkeninin 3. karakteri yok. program çalıştıktan sonra hata verecek : runtime error

        System.out.println("Program bitti");
        //derleme zamanı hataları: program çalışamadı.: COMPILE ERROR
        //Program çalışmaya başladıktan sonra oluşan hatalar : RUNTİME ERROR
    }
}
