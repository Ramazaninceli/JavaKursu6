package Gun44;

public class S24 {
    public static void main(String[] args) {
        
        String[] strs =new String[2];
        int idx=0;

//        strs[0]="";
//        strs[1]="";
        //Null değere
        for (String s:strs ) {
            strs[idx].concat("element " + idx);
           // strs[idx]= strs[idx].concat("element " + idx);// yazdırmak için eşitlemek gerekir
            idx++;
            
        }
        for (idx = 0; idx <strs.length ; idx++) {
            System.out.println("strs[idx] = " + strs[idx]);
            
        }
    }
}
