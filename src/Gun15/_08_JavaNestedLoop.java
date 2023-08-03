package Gun15;

public class _08_JavaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazınız

        //*           1. satırda 1 yıldız
        //**           2. satırda 2 yıldız
        //***           3. satırda 3 yıldız
        //****           4. satırda 4 yıldız
        //*****           5. satırda 5 yıldız





        for (int satir = 1; satir <=5 ; satir++) {

            for (int j = 1; j <=satir ; j++)
                System.out.print("*");

            System.out.println();
        }


    }
}
