package com.yjj.yjjshopping.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjj.yjjshopping.pojo.User;
import com.yjj.yjjshopping.service.UserService;
import com.yjj.yjjshopping.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 91067
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-01-01 18:42:12
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User correctUser(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",user.getUsername()).eq("userpassword",user.getUserpassword());
        List<User> users = userMapper.selectList(queryWrapper);
        if (users.size()!=0){
            return users.get(0);
        }else {
            return null;
        }
    }

    @Override
    public User getUsersShopCart(String username) {
        User user = userMapper.findUsersShopCartByUsername(username);
        return user;
    }
}




