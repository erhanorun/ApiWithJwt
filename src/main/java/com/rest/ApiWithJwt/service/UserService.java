package com.rest.ApiWithJwt.service;

import com.rest.ApiWithJwt.model.UserInfo;
import com.rest.ApiWithJwt.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserInfo> getAllUsers() {
        return userRepository.findAll();
    }

    public UserInfo saveOneUser(UserInfo newUser) {
        return userRepository.save(newUser);
    }

    public UserInfo getOneUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public UserInfo updateOneUser(Long userId, UserInfo newUser) {
        Optional<UserInfo> user = userRepository.findById(userId);
        if(user.isPresent()) {
            UserInfo foundUser = user.get();
            foundUser.setUsername(newUser.getUsername());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        }else
            return null;
    }

    public void deleteById(Long userId) {
        try {
            userRepository.deleteById(userId);
        }catch(EmptyResultDataAccessException e) {
            System.out.println("User "+userId+" doesn't exist");
        }
    }

    public UserInfo getOneUserByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

}
