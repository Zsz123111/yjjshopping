package com.yjj.yjjshopping.controller;

import com.yjj.yjjshopping.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class PageController {
    @Autowired
    ShoppingService shoppingService;
    @RequestMapping("/{page}")
    public String test(@PathVariable String page, Map map){
        if (page.equals("index")){
            map.put("shoppings",shoppingService.findAll());
        }
        return page;
    }
    // 忽略访问项目logo
    @RequestMapping("favicon.ico")
    @ResponseBody
    void returnNoFavicon() {}
}
