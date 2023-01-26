package com.yjj.yjjshopping.service;

import com.yjj.yjjshopping.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 91067
* @description 针对表【user】的数据库操作Service
* @createDate 2023-01-01 18:42:12
*/
public interface UserService extends IService<User> {
    User correctUser(User user);

    User getUsersShopCart(String username);
}
