package com.yjj.yjjshopping.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjj.yjjshopping.pojo.Shopping;
import com.yjj.yjjshopping.service.ShoppingService;
import com.yjj.yjjshopping.mapper.ShoppingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;

/**
* @author 91067
* @description 针对表【shopping】的数据库操作Service实现
* @createDate 2023-01-01 18:42:12
*/
@Service
public class ShoppingServiceImpl extends ServiceImpl<ShoppingMapper, Shopping>
    implements ShoppingService{
    @Autowired
    ShoppingMapper shoppingMapper;


    @Override
    public List<Shopping> findAll() {
        List<Shopping> shoppings = shoppingMapper.selectList(null);
        return shoppings;
    }

    @Override
    public Shopping findShoppingBySname(String sname) {
        QueryWrapper<Shopping> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sname",sname);
        List<Shopping> shoppings = shoppingMapper.selectList(queryWrapper);
        return shoppings.get(0);
    }

    @Override
    public void addShopping(int sid, int uid) {
        shoppingMapper.insertShoppingIntoShopCart(sid,uid);
    }
}




