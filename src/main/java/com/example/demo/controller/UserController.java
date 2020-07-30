package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome home</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User </h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome admin </h1>");
    }

    @PostMapping("/createUser")
    public void saveUser(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("/user/{id}")
    public User getUserWithId(@PathVariable long id) {
        return userService.getUserById(id);
    }

}
