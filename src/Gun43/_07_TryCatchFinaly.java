package Gun43;

public class _07_TryCatchFinaly {
    public static void main(String[] args) {
        String str="";
        long starTime=0;
        try {
            starTime=System.currentTimeMillis();
            System.out.println("hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("hatadan sonraki kısım");
           }catch (Exception ex){
            System.out.println("Catch boloğu çalıştı");
            //hata olduğunda çalışacaklar
        }
        finally {//hata olsa da olmasa da çalışıyor
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
            System.out.println(System.currentTimeMillis()-starTime);

        }
        System.out.println("diğer çalışacak kodlar");
        System.out.println("Program bitti");
    }
}
