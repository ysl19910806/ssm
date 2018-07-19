package com.bigspring.service;

import com.bigspring.model.User;

public interface UserService {
    User selectUserById(Integer userId);  
}