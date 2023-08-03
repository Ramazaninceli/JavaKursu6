package SerbestCalisma.Soru;

public class Hesap {

    private double yatan=0;
     private double cekilen=0;
      private double bakiye=0;

      public void yatirilanPara(double yatanki){
          this.yatan=this.yatan+yatanki;
          this.bakiye=this.bakiye+yatanki;

      }

      public void cekilenPara(double cekilenki){
          this.cekilen=this.cekilen+cekilenki;
          this.bakiye=this.bakiye-cekilenki;
      }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + this.yatan +
                ", cekilen=" + this.cekilen +
                ", bakiye=" + this.bakiye +
                '}';
    }
}
