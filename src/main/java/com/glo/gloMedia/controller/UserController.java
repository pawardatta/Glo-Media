package com.glo.gloMedia.controller;

import com.glo.gloMedia.entity.User;
import com.glo.gloMedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserController {
    @Autowired
    UserService userService;

    public void addUser(User user) {
        userService.addUser(user);

    }

    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    public Optional<User> getUserById(long userId) {
        return userService.getUserById(userId);
    }

    public void deleteUser(long userId) {
        userService.deleteUser(userId);

    }

    public List<User> findAllByOrderByUserNameAsc() {
        return userService.findAllByOrderByUserNameAsc();
    }
//
//
    public List<User> findAllByOrderByUserIdDesc() {
        return userService.findAllByOrderByUserIdDesc();
    }
//
    public List<User> findAllUsersWithValidProfile() {
        return userService.findAllUsersWithValidProfile();
    }
}
