package com.yjj.yjjshopping.controller;

import com.yjj.yjjshopping.mapper.UserMapper;
import com.yjj.yjjshopping.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopCartController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/shopcart")
    public String findShopCart(String username, Model model){
        User user1 = userMapper.findUsersShopCartByUsername(username);
        model.addAttribute("us",user1.getShopcart());
        return "shopCart";
    }
}
