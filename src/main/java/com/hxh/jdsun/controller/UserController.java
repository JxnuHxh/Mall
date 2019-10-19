package com.hxh.jdsun.controller;

import com.hxh.jdsun.util.SendMessageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/reg")
    public String reg(){
        return "regTel";
    }
    @RequestMapping("/sendCode")
    public Object sendCode (){
        String tel="18379407495";
        String code = SendMessageUtil.getRandomCode(6);
        int m=SendMessageUtil.send("zgycsmb","d41d8cd98f00b204e980",tel,code);
        return null;
    }
}
