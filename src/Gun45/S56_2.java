package Gun45;

public class S56_2 {
    public static void main(String[] args) {


        String names[] ={"Thomas","Peter","joseph"};
        String pwd[]=new String[3];
        int idx=0;


        for (String n:names ) {
        try {


                pwd[idx] = n.substring(2, 6);//omas // 2 dahil, 5 dahil değil
                System.out.println(pwd[idx]); //omas yazdı
                idx++;//1


        }catch (Exception e){
            System.out.println("Invalıd name");//ınvalid name
        }
        //hata olan satırdan sonraki kodlar çalışmaz
    }

        for (String s: pwd ) {
            System.out.println("s = " + s);
            
        }
    }
    }

