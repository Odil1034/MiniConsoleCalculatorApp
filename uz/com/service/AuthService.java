package uz.com.service;

import uz.com.entity.User;
import uz.com.exeption.UsernameAlReadyException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Baxriddinov Odiljon
 * @since 04/09/2025 22:18
 */
public class AuthService {

    private static final List<User> users = new ArrayList<>();

    public static boolean register(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                throw new UsernameAlReadyException("This username already exists, please replace it");
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return true;
    }

    public static User login(String username, String password) {
        for (User user : users) {
            if (user.getPassword().equals(password) && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
