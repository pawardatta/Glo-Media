package com.glo.gloMedia.service;

import com.glo.gloMedia.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
     void addUser(User user);
     List<User> getAllUser();
     Optional<User> getUserById(long userId);
     void deleteUser(long userId);
     List<User> findAllByOrderByUserNameAsc();
    List<User> findAllByOrderByUserIdDesc();
    List<User> findAllUsersWithValidProfile();
}
