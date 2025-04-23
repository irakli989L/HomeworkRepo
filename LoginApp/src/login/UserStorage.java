package login;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private Map<String, User> users;

    public UserStorage() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void printUsers() {
        users.values()
                .forEach(System.out::println);
        System.out.println();
    }
}
