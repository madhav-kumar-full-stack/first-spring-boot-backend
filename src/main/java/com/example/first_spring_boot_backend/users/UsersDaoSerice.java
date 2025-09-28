package com.example.first_spring_boot_backend.users;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class UsersDaoSerice {

    private static Map<Integer, User> usersMap = new HashMap<>();

    public String createUser(User user) {
        int id = (int) (Math.random() * 1000);
        user.id = id;
        usersMap.put(id, user);
        return "User Created Successfully!";
    }

    public Collection<User> getUsers() {
        return usersMap.values();
    }

    public User getUser(int id) {
        return usersMap.get(id);
    }

    public String updateUser(int id, User user) {
        User existingUser = usersMap.get(id);
        if (existingUser != null) {
            usersMap.replace(id, user);
            return "User Updated Successfully!";
        } else {
            return "User not found!";
        }
    }

    public String deleteUser(int id) {
        User existingUser = usersMap.get(id);
        if (existingUser != null) {
            usersMap.remove(id);
            return "User deleted successfully";
        } else {
            return "User not found!";
        }
    }
}
