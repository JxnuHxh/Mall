package com.hxh.jdsun.controller;

import com.hxh.jdsun.util.SendMessageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/reg")
    public String reg(){
        return "regTel";
    }
    @RequestMapping("/sendCode")
    @ResponseBody
    public Object sendCode (HttpServletRequest request){
        //服务器端接收客户端请求
        String tel=request.getParameter("tel");
        String code = SendMessageUtil.getRandomCode(6);
        int m=SendMessageUtil.send("zgycsmb","d41d8cd98f00b204e98011",tel,code);
        String message = SendMessageUtil.getMessage(m);
        Map<String,Object> map=new HashMap<>();
        map.put("code",code);
        map.put("massage","京东"+message);
        return map;
    }
    @RequestMapping("/reg2")
    public String reg2(){
        return "reg2";
    }
}
