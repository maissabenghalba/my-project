package com.guser.gestionuser.service;

import com.guser.gestionuser.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User addUser (User user);
    User updateUser(User user);
    User getUserById(long id);
    void deleteUser(long id);
    List<User> getAllUsers();
}
