package com.hxh.jdsun.service;


import com.hxh.jdsun.dao.UserDao;
import com.hxh.jdsun.model.ResultEntity;
import com.hxh.jdsun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userServie")
public class UserServiceImpl implements UserService{
    //要调用dao 要自动注入dao
    @Autowired
    public UserDao userDao;
    //定义一个变量
    public ResultEntity resultEntity;
    @Override
    public ResultEntity insert(User u) {
        int toReg=userDao.insert(u);
        if(toReg>0){
            resultEntity=new ResultEntity(200,"succ");
        }else{
           resultEntity=new ResultEntity(201,"false");
        }
        return null;
    }
    @Override
    public ResultEntity login(User user) {
        User u=userDao.login(user);
        if(u!=null){
            resultEntity=new ResultEntity(200,"succ");
        }else{
            resultEntity=new ResultEntity(201,"false");
        }
        return resultEntity;
    }

}
