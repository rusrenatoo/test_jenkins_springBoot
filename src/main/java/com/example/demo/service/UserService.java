package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
//public class UserService implements UserDetailsService {
public class UserService {

    @Autowired
    UserRepository userRepository;
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//       return new MyUserDetails(userRepository.findByName(s));
//    }

    public void save(User user) {
        userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByName(username);
    }

    public User getUserById(long id) {
        return userRepository.findUserById(id);
    }

    public int add(int x, int y) {
        return x + y;
    }
}
