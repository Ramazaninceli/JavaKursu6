package Gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {

        TeslaCar tesla=new TeslaCar("model5", 310);
        ToyotaPrius prius= new ToyotaPrius("sedan", 1200);
        Bus bus=new Bus("Iveco",7000);

        ArrayList<Vehicle> arabalar= new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(prius);
        arabalar.add(bus);

        for (Vehicle v: arabalar ) {

            System.out.println("----------------------------");

            System.out.println(v.getClass().getSimpleName());

            System.out.println("-----------------------------");

            System.out.println(v.getModel());
            System.out.println(v.getEngine());


            if (v instanceof TeslaCar){

                System.out.println(((TeslaCar)v).drive());
                System.out.println(((TeslaCar)v).changeBattery());

            } else
                if (v instanceof ToyotaPrius) {
                    System.out.println(((ToyotaPrius)v).drive());
                    System.out.println(((ToyotaPrius)v).changeBattery());
                    System.out.println(((ToyotaPrius)v).changeOil());
            }else {
                    System.out.println(((Bus) v).drive());
                    System.out.println(((Bus) v).changeDeisel());
                }
        }
    }
}
