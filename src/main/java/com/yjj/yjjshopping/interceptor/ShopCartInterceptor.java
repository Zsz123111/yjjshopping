package com.yjj.yjjshopping.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ShopCartInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user")!=null){
            return true;
        }else {
            request.setAttribute("error","请先登录！");
            request.getRequestDispatcher("login").forward(request,response);
        }
        return true;
    }

}
