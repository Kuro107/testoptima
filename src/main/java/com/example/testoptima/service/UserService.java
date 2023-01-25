package com.example.testoptima.service;

import com.example.testoptima.entity.User;
import com.example.testoptima.enums.UserStatus;
import com.example.testoptima.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void save(String fio){
        User user = new User();
        user.setFio(fio);
        user.setStatus(UserStatus.ACTIVE);
        userRepository.save(user);
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
