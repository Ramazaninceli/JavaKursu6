package Gun47;

public class MarkList {
    int num;
    public static void graceMarks(MarkList obj4){// fonksiyondaki adı obj4 amaobj1 ve obj2 dir
        obj4.num+=10; // Foksiyona nesnenin kendisi gider, aynı dizi gibi
    }

    public static void main(String[] args) {

        MarkList obj1 =new MarkList();// new lediği icin birtane nesne oluştu. obj1.num=> 0(sıfır)
        MarkList obj2=obj1;// hafızada marklist değer oluşur 1 tane
        MarkList obj3=null;// buda oluşur ancak null olarak yani boş
        obj2.num=60; //obj2.num ->60, obj1.num ->60
        graceMarks(obj2);// aynı zamanda obj1 e eşit
        System.out.println("obj2 = " + obj2.num);//70
        System.out.println("obj1 = " + obj1.num);//70

    }

    //hafızada kaçtane marklist nesnesi vardır.
    //obj2.num un değeri kaç oldu?
}
