package com.bigspring.test.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;
import com.bigspring.model.User;
import com.bigspring.service.UserService;
import com.bigspring.test.SpringTestCase;  

public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
}