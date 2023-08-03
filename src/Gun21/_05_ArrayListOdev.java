package Gun21;

public class _05_ArrayListOdev {
    public static void main(String[] args) {

        //Soru 1- Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        //[
        //[ 1, 2, 3 ],
        //[ 4, 5, 6 ],
        //[ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]

      /*  int[][] myArray = {{1, 2, 3} , {4, 5, 6},  {7, 8, 9}};

        for (int i = 0; i < myArray.length; i++) {

            System.out.println(Arrays.toString(myArray[i]));
        }
        ArrayList<Integer> myArrayList = new ArrayList<>();

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArrayList.add(myArray[i][j]);
            }
        }
        System.out.println(myArrayList);*/

        //Soru 2 - ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)


        /*ArrayList<String> meyveler = new ArrayList<>();

        meyveler.add("Orange");
        meyveler.add("Kiwi");
        meyveler.add("Peach");
        meyveler.add("Orange");
        meyveler.add("Orange");

        int sayac = getCount(meyveler, "Orange");
        System.out.println("Orange stringi " + sayac + " kez tekrarlanıyor.");
    }
    public static int getCount(ArrayList<String> arrayList, String target) {
        int sayac = 0;
        for (String str : arrayList) {
            if (str.equals(target)) {
                sayac++;
            }
        }
        return sayac;

        //Soru 3- getSum() isminde bir method oluşturun.
        //Parametresi ArrayList olmalı
        //Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün.
        //Örneğin;
        //Arraylist = 1,2,3,4,5
        //return 15 olmalı

        ArrayList<Integer> toplam = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Toplam = "+getSum(toplam));

    }
    public static int getSum(ArrayList<Integer> toplam){
        int tplm = 0;
        for (int i = 0; i <= toplam.size(); i++) {
            tplm+=i;

        }
        return tplm;

//        Soru 4 - getLength() isminde bir method oluşturun.
//        Parametre olarak String ArrayList
//        Return tipi Integer ArrayList
//        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//        Tüm elementlerin uzunluğunu döndürün
//        Örneğin;
//        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//        Tüm Stringlerin uzunluklarını yazdırın;
//        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
        ArrayList<String> sehir = new ArrayList<>();
        sehir.add("New jersey");
        sehir.add("New york");
        sehir.add("Ohio");
        sehir.add("Florida");
        sehir.add("Boston");

       System.out.println(getLength(sehir));
    }
    public static int getLength(ArrayList<String> sehir){
        int uzunluk = 0;
        for (int i = 0; i < sehir.size(); i++) {

            System.out.print(sehir.get(i).length()+" , ");
            //uzunluk = sehir.size();

        }
        return uzunluk;

//        Soru 5 -İsmi changelnArraylist() olan bir method oluşturun.
//        Parametre olarak String ArrayList, String s1, String s2
//        Arraylist'te s1'i s2 olarak değiştirin
//        Return String arrayList
//                Örneğin;
//        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//        s1 = blue
//        s2 = yellow
//        Tüm blue 'ları yellow'a dönüştürün.
//        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("yellow");
        renkler.add("red");
        renkler.add("blue");
        renkler.add("red");
        renkler.add("blue");

        String s1 = "blue";
        String s2 = "yellow";

        System.out.println(changelnArraylist(renkler,s1,s2));
    }
    public static ArrayList changelnArraylist(ArrayList<String> renkler,String s1 , String s2){
            for (int i = 0; i < renkler.size(); i++) {
            if (renkler.get(i).equals(s1))
                renkler.set(i,s2);
        }
        return renkler;
}*/

    }
}