package JavaObjects;

public class TestUserLogin {
    public static void main(String[] args) {
        User user = new User("halit","halitbinvelid","123456");
        System.out.println(user.getName());
        System.out.println(user.getUsername());


        UserService userService = new UserService();
        Login login = userService.authenticate("halitertas@gmail.com", "123456");

        User user2 = (User) login;
        System.out.println(user2.getName());
    }
} 
