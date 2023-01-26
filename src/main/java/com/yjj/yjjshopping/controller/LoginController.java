package com.yjj.yjjshopping.controller;


import com.yjj.yjjshopping.pojo.User;
import com.yjj.yjjshopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping("/log")
    public String login(User user, Map map, HttpSession session) {
        User user1 = userService.correctUser(user);
        if (user1 != null) {
            session.setAttribute("user", user1);
            return "redirect:index";
        } else {
            map.put("error", "用户名或密码错误！");
            return "forward:login";
        }
    }
}
