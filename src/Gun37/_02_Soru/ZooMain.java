package Gun37._02_Soru;

import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {

        Duck duck=new Duck();
        Shark shark=new Shark();
        Swallow swallow=new Swallow();
        Cat cat=new Cat();

        ArrayList<IAnimal> animals =new ArrayList<>();
        animals.add(duck);
        animals.add(shark);
        animals.add(swallow);
        animals.add(cat);

        for (IAnimal h: animals) {

            System.out.println("----------------");
            System.out.println(h.getClass().getSimpleName());
            System.out.println("--------------------------");

        //    System.out.println(h.food());// alttaki if yapısıyla aynı işi yapmaktadır.

            if (h instanceof Duck){
                System.out.println(((Duck)h).food());
            } else if (h instanceof Shark) {
                System.out.println(((Shark)h).food());
            } else if (h instanceof Swallow) {
                System.out.println(((Swallow)h).food());
            }else{
                System.out.println(((Cat)h).food());
            }


        }


    }
}
