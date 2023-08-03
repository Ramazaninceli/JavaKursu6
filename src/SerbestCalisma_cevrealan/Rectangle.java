package SerbestCalisma_cevrealan;

public class Rectangle {
    int width;
    int length;

    public int Cevre(){

        int cevre=(this.width+this.length)*2;
        System.out.println("cevre = " + cevre);
        return cevre;
    }

    public int Alan(){
        int alan=(this.width*this.length);

        System.out.println("alan = " + alan);
        return alan;
    }

    public void degerAta(int a, int b){

    this.width=a;
    this.length=b;

    }


}
