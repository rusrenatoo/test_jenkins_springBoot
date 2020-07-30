package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;

    final static Logger LOG = Logger.getLogger(DemoApplicationTests.class.getName());

    @BeforeEach
    public void init() {
        System.out.println("Before");
    }

    @Test
    void testAdd() {
        System.out.println("Test");
        Assertions.assertEquals(3 + 2, userService.add(3,2));
    }

    @AfterEach
    void after() {
        System.out.println("After");
    }



}
