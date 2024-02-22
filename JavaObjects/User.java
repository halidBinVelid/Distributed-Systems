package JavaObjects;

public class User implements Person, Login {
    private String name;
    private String username;
    private String password;

    public String getName(){
        return name;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }






    public User(String name, String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }
}
