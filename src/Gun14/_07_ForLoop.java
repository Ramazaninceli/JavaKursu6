package Gun14;

public class _07_ForLoop {
    public static void main(String[] args) {
        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz
        // toplam 50yi geçtiğinde , mesaj yazınız(50 geçildi)

        int toplam=0;
        boolean sinirAsildi=false;

        for (int i = 0; i <100 ; i=i+2) {
            toplam = toplam + i;
            //System.out.println("i = " + i);

            if (toplam > 50 && sinirAsildi==false) {
                System.out.println("toplam 50 yi geçildi");
                sinirAsildi=true;
            }

        }
        System.out.println("toplam = " + toplam);
        }

    }

