package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoTests {

    @Mock
    UserRepository userRepository;
    User user;

    @BeforeEach
    public void init() {
        user = new User("Adrian", "parolaLuiAdrian");
    }

    @BeforeEach
    public void initMock() {
        Mockito.when(userRepository.findByName("Adrian")).thenReturn(user);
    }

    @Test
    public void testMockedRepository() {
        System.out.println(userRepository.findByName("Adrian"));
        Assertions.assertEquals(user.getName(), userRepository.findByName("Adrian").getName());
    }

}
