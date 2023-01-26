package com.yjj.yjjshopping.configration;

import com.yjj.yjjshopping.interceptor.ShopCartInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class MvcConfiguration implements WebMvcConfigurer {
    @Autowired
    ShopCartInterceptor shopCartInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);

        registry.addInterceptor(shopCartInterceptor)
                .addPathPatterns("/shopcart/**")
                .addPathPatterns("/addshopping/**");
    }
}
