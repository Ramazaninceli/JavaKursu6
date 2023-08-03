package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _05_JavaTryCatch {
    public static void main(String[] args) {
        
        try {//dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih =LocalDate.of(2023, Month.FEBRUARY,30);//Runtime Error
                        
        }//hata olduğu zaman programı kırma
        catch (Exception ex)// ex isimli değişkende oluşan hataların bilgisi atanıyor
        {// hata olduğunda yapıması isenenler buraya yazılır.
            System.out.println("Hata oluştu " + ex);
            System.out.println("ex.getMessage() = " + ex.getMessage());
            
            
        }
        System.out.println("Program bitti.");

        // Kursdaki hata durum yönetimi
        try{
            // Java ve Toolları çalışmaya devam et
            // Konuları grupla çalışmaya devam
        } // anlamadığın yerler mi oldu , runtime error
        catch(Exception ex){
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // anlamadığın yerleri sor,
            // videoları tekrar izle
            //grup çalışmasına devam et
        }
    }
    
}
