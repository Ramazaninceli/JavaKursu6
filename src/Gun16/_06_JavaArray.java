package Gun16;

public class _06_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trt, kanalD atv ,fox, habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.

        String[] list=new String[]{"TRT","KanalD","atv","Fox","HaberTürk"};

        int ramdomIndex=(int) (Math.random()*list.length);
        System.out.println( list[ramdomIndex]+ " 'e söz hakkı verebilirsiniz :" );

        // TODO : gunun sorusu: bir döngü ile 5 tane rastgele buldurunuz
        //TODO : fakat bir bulduğunu tekrar bulmasın,







    }
}
