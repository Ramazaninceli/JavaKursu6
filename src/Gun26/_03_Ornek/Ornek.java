package Gun26._03_Ornek;

public class Ornek {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        rectangle.width=5;
        rectangle.length=10;

        rectangle.Cevre();
        rectangle.Alan();

        int cevre= rectangle.Cevre2();
        int alan=rectangle.Alan2();
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

        //metod ile değer ata
        rectangle.degerAta(4,5);
        rectangle.Alan();
        rectangle.Cevre();
        
        
        
        
        

    }
}
