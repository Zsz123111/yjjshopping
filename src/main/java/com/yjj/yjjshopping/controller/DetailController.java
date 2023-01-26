package com.yjj.yjjshopping.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yjj.yjjshopping.mapper.UserMapper;
import com.yjj.yjjshopping.pojo.Shopping;
import com.yjj.yjjshopping.pojo.User;
import com.yjj.yjjshopping.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class DetailController {
    @Autowired
    ShoppingService shoppingService;
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/detail")
    public ModelAndView showDetail(ModelAndView modelAndView, String sname){
        Shopping shopping = shoppingService.findShoppingBySname(sname);
        Map<String, Object> model = modelAndView.getModel();
        model.put("shopping",shopping);
        modelAndView.setViewName("detail");
        return modelAndView;
    }
    @RequestMapping("/addshopping")
    public String addShopping(@RequestParam("sid")int sid,@RequestParam("uid") int uid,@RequestParam("username")String username,Map map){
        shoppingService.addShopping(sid,uid);
        User user1 = userMapper.findUsersShopCartByUsername(username);
        map.put("us",user1.getShopcart());
        return "shopCart";
    }
}
