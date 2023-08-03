package TekrarDersler;

import java.util.ArrayList;

public class _09_ArrayList2D {
    public static void main(String[] args) {

        ArrayList<Integer> matNotları=new ArrayList<>();//her bir satırı sıy int[]
        ArrayList<Integer> kimNotları=new ArrayList<>();//her bir satırı sıy int[]

        ArrayList<ArrayList<Integer>> tumNotlar=new ArrayList<>(); // her bir satırı liste int[][]

        matNotları.add(5);
        matNotları.add(15);
        matNotları.add(25);
        matNotları.add(35);

        tumNotlar.add(matNotları);

        kimNotları.add(5);
        kimNotları.add(15);
        kimNotları.add(25);
        kimNotları.add(35);

        tumNotlar.add(kimNotları);
        matNotları.get(0);//matın ilk notunu verir
        tumNotlar.get(0).get(0);//matın ilk notunu verir



    }
}
