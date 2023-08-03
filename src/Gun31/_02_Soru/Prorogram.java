package Gun31._02_Soru;

public class Prorogram {
    public static void main(String[] args) {
        User user1=new User("ismet",UserRolu.ADMIN,UserStatusu.AKTIF);
        User user2=new User("Mehmet",UserRolu.SATIS,UserStatusu.PASIF);
        User user3=new User("Ayse",UserRolu.MUDUR,UserStatusu.AKTIF);

        User.userSil(user1);
        User.userSil(user2);
        User.userSil(user3);

    }
}
