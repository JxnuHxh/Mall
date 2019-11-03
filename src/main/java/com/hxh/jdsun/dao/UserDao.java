package com.hxh.jdsun.dao;


import com.hxh.jdsun.model.User;
import org.springframework.stereotype.Repository;

/*
* 标记dao层，和mapper.xml关联
* */

@Repository
public interface UserDao {
    public int insert(User u);// 注册
    public User login(User user);//登陆

}
