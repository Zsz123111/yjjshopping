package com.yjj.yjjshopping.mapper;

import com.yjj.yjjshopping.pojo.Shopping;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 91067
* @description 针对表【shopping】的数据库操作Mapper
* @createDate 2023-01-01 18:42:12
* @Entity generator.pojo.Shopping
*/
@Mapper
public interface ShoppingMapper extends BaseMapper<Shopping> {
    void insertShoppingIntoShopCart(@Param("sid")int sid,@Param("uid") int uid);
}




