package com.yjj.yjjshopping.service;

import com.yjj.yjjshopping.pojo.Shopping;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 91067
* @description 针对表【shopping】的数据库操作Service
* @createDate 2023-01-01 18:42:12
*/
public interface ShoppingService extends IService<Shopping> {
    List<Shopping> findAll();

    Shopping findShoppingBySname(String sname);

    void addShopping(int sid,int uid);
}
