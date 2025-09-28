package com.example.first_spring_boot_backend.users;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserResource {
    UsersDaoSerice usersDaoSerice;

    public UserResource(UsersDaoSerice usersDaoSerice) {
        this.usersDaoSerice = usersDaoSerice;
    }

    @GetMapping("/users")
    public Object[] getUsers() {
        return usersDaoSerice.getUsers().toArray();
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        return usersDaoSerice.createUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id) {
        return usersDaoSerice.getUser(id);
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody User user) {
        return usersDaoSerice.updateUser(id, user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        return usersDaoSerice.deleteUser(id);
    }
}
