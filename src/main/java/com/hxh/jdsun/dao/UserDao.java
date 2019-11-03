package com.hxh.jdsun.dao;

import com.hxh.jdsun.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public int insert(User u);
    public User login(User u);


}
