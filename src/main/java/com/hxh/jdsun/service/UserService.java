package com.hxh.jdsun.service;


import com.hxh.jdsun.model.ResultEntity;
import com.hxh.jdsun.model.User;

public interface UserService {
    public ResultEntity login(User user);
    public ResultEntity insert(User u);
}
