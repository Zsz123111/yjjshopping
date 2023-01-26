package com.yjj.yjjshopping.mapper;

import com.yjj.yjjshopping.pojo.Shopping;
import com.yjj.yjjshopping.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 91067
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-01-01 18:42:12
* @Entity generator.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User findUsersShopCartByUsername(String username);
}




