package Gun25;

//class tiplerin tanımlandğı yer

public class _01_JavaClassAndObject {

    //metodların yazıldığı yer
    
    
    
    
    public static void main(String[] args) {//başla
        
        //ana programın çalıştığı yer

        Ogrenci ogr1=new Ogrenci();
        ogr1.adi="Ramazan";
        ogr1.soyadi="İnce";
        ogr1.adresi="dikkal";
        ogr1.okulNo=1001;
        ogr1.telefonu="12245646";
        System.out.println("ogr1.adi  soyadi = " + ogr1.adi+"\t"+ogr1.soyadi);
        System.out.println("ogr1 = " + ogr1.adresi);
        
        
    }//dur
    
    //metodların yazıldğı yer
    
}
//class tiplerin tanımlandğı yer

class Ogrenci{
    
    int okulNo;
    String adi;
    String soyadi;
    int sinifi;
    String adresi;
    String telefonu;
}

