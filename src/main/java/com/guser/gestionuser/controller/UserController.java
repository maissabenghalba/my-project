package com.guser.gestionuser.controller;

import com.guser.gestionuser.entity.User;
import com.guser.gestionuser.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id) {
         userService.deleteUser(id);
    }
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @GetMapping("/getById/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }
    @GetMapping("/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}


