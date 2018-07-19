package com.bigspring.dao;

import com.bigspring.model.User;

public interface UserDao {
    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);
    
}