package Gun39._01_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();// ektisi yok
        System.out.println("a.mesaj = " +A.mesaj);//A

        B b =new B();//constructur çalıştı
        System.out.println("a.mesaj = " +A.mesaj);//B

        A a2=new A();//bunu değiştirici etkisi yok
        System.out.println("a.mesaj = " +A.mesaj);//B

        // çıktısı ne olur
        //ABB

    }
}
