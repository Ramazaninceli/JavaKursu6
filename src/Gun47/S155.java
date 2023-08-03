package Gun47;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);//remove(1) burayı siler
        points.add(3);
        points.add(4);
        points.add(null);// null bir değer aynı zamanda
        points.remove(1);// indexi 1 olanı siler
        System.out.println(points.contains(3));

        points.remove((Object)1);//1 değeril olanı siler en baştaki
        points.remove(null);
        System.out.println("points = " + points);

        //String, Integer,Double,Long NULL alabiliyor,
        //int,double,float,long -> defaultu 0(sıfır)
    }
}
