package Gun47;

public class MyField {
    int x; // aslında this.x i ifade eder
    int y; // aslında this.y yi ifade eder.

    public void doStuff(int x , int y){
        x=x; //classa etkisi yok this.x değişmedi=100 değeri alır.
        y=this.y; // classta bir değişiklik yok. this.y y=0;
        //this yoksa yada this eşittirden sonra ise sadece methodun başındaki değeri alır. this varsa yada başta ise clastaki değeri alır.

    }
    public void display(){
        System.out.print(x+":"+ y+":");
    }

    public static void main(String[] args) {

        MyField m1=new MyField();// newlendiği için yeni bir nesne oluştu
        System.out.println("m1.x = " + m1.x);
        System.out.println("m1.y = " + m1.y);

        m1.x=100;
        m1.y=200;
        System.out.println("m1.x = " + m1.x);
        System.out.println("m1.y = " + m1.y);

        MyField m2=new MyField(); //m2 nin x ve y si 0 dır.
        m2.doStuff(m1.x, m1.y);//bunların değerleri gidiyor
        //bu işlem herhangi bir değer değiştirmez
        m1.display();//100:200
        m2.display();//0:0

    }
}
