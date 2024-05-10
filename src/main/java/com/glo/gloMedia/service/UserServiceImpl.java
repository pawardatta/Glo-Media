package com.glo.gloMedia.service;

import com.glo.gloMedia.entity.User;
import com.glo.gloMedia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);

    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void deleteUser(long userId) {
        userRepository.deleteById(userId);

    }
//
    @Override
    public List<User> findAllByOrderByUserNameAsc() {
        return userRepository.findAllByOrderByUserNameAsc();
    }
//
    @Override
    public List<User> findAllByOrderByUserIdDesc() {
        return userRepository.findAllByOrderByUserIdDesc();
    }
//
    @Override
    public List<User> findAllUsersWithValidProfile() {
        return userRepository.findAllUsersWithValidProfile();
    }
}
