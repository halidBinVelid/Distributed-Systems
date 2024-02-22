package JavaObjects;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private static Map<String, User> users = new HashMap<>();

    static {
        User user = new User("halit","halitertas@gmail.com","123456");
        users.put(user.getUsername(), user);

    }
    
    public Login authenticate(String username, String password){
        User user = users.get(username);

        if(user != null && password.equals(user.getPassword())){
            return user;
        }

        throw new RuntimeException("credentials are not matched");
    }
}
