package com.sunivo.ws;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.sunivo.beans.entity.User;
import com.sunivo.ws.interfaces.server.IUserSampleService;
import com.sunivo.ws.service.UserService;

@ContextConfiguration(locations = { "classpath:application/*.xml" })
public class UserTest extends AbstractTestNGSpringContextTests {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private IUserSampleService userSampleService;
    
    @Test
    public void insertUserTest() {
        User user = new User();
        user.setAge(2);
        user.setBirthday(new Date());
        user.setBriefintroduction("大文本");
//        userService.insertUser(user);
        
        userSampleService.getUserList(user);
    }
}
