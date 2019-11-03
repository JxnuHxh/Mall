package com.hxh.jdsun.service;

import com.hxh.jdsun.dao.UserDao;
import com.hxh.jdsun.model.ResultEntity;
import com.hxh.jdsun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    public ResultEntity resultEntity;
 @Autowired
 public UserDao userDao;
    public ResultEntity login(User u) {
        return null;
    }

    public ResultEntity insert(User u) {
        int toReg = userDao.insert(u);
        if(toReg>0){
           resultEntity=new ResultEntity(200,"suss");
        }
        return null;
    }
}
