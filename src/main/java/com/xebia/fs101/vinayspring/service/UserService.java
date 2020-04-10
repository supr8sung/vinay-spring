package com.xebia.fs101.vinayspring.service;

import com.xebia.fs101.vinayspring.entity.User;
import com.xebia.fs101.vinayspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User save(User user) {
         return userRepository.save(user);

    }

    public User find(Long id) {

        return userRepository.findById(id).orElseThrow(()->new IllegalArgumentException("User not found"));

    }
}
