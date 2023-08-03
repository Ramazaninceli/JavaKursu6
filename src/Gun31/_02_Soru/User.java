package Gun31._02_Soru;

public class User {




    String username;
    UserRolu role;
    UserStatusu statu;

    public static void userSil(User user){

        if (user.role==UserRolu.ADMIN)
        {
            System.out.println("Admin silinemez.");
        }else
        {
            System.out.println("User silindi.");
        }
    }


    public User(String username, UserRolu role, UserStatusu statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
