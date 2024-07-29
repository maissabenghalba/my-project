package com.guser.gestionuser.service.serviceImpl;

import com.guser.gestionuser.entity.User;
import com.guser.gestionuser.repository.UserReposiroty;
import com.guser.gestionuser.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    public UserReposiroty userReposiroty;

    @Override
    public User addUser(User user) {
        return userReposiroty.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userReposiroty.save(user);
    }

    @Override
    public User getUserById(long id) {
        Optional<User> optionalUser = userReposiroty.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public void deleteUser(long id) { userReposiroty.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userReposiroty.findAll();
    }
}
