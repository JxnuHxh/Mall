package com.hxh.jdsun.controller;


import com.hxh.jdsun.model.ResultEntity;
import com.hxh.jdsun.model.User;
import com.hxh.jdsun.service.UserService;
import com.hxh.jdsun.util.SendMessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/user")
public class UserContr {
  @Autowired
  public UserService userService;

  @RequestMapping("/reg")
  public String reg(){
      return "regTel";
  }
  @RequestMapping("/sendCode")
  @ResponseBody
  public Object sendCode(HttpServletRequest request){
      //* HttpServletRequest 服务器端接收客户端请求.
      String tel=request.getParameter("tel");
      //生成验证码
      String code= SendMessageUtil.getRandomCode(6);
      int m=SendMessageUtil.send("zgycsmb",
              "d41d8cd98f00b204e98011",tel,code);
      //把code传给客户端
      String message=SendMessageUtil.getMessage(m);
      Map<String ,Object> map=new HashMap<>();
      map.put("code",code);
      map.put("message","京东注册页面验证码为"+message);
      return map;
  }

  @RequestMapping("/reg2")
  public String reg2(){
      return "reg";
  }

  @RequestMapping("/toReg")
  public String toReg(User u, Model m){
      userService.insert(u);
      return "redirect:/user/login";
  }

  @RequestMapping("/login")
  public String login(){
     return "login";
  }

  @RequestMapping("/toLogin")
  public String toLogin(User user,Model m){
      //页面上的userName pass取过来
      ResultEntity re=userService.login(user);
      if(re.getCode()==200){
          //把user这个值存到session中,在另外的页面可取值
          m.addAttribute("user",user);
      }
      System.out.println(re.getCode());
      return "redirect:/goods/list0";
  }
}

