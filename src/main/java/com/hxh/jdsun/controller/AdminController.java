package com.hxh.jdsun.controller;

import com.hxh.jdsun.model.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @RequestMapping("goods/save.action")
    @ResponseBody
    public String save(Goods goods){
        System.out.println(goods.getTitle());
        return "success";

    }
}
