package com.example.deltaforceemulator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.deltaforceemulator.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends IService<User>, UserDetailsService {
    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @return 注册成功返回 User 对象，失败返回 null 或抛出异常
     */
    User register(String username, String password);

    /**
     * 用户登录 (This method is now handled by Spring Security's flow)
     * @param username 用户名
     * @param password 密码
     * @return 登录成功返回 User 对象，失败返回 null
     */
    User login(String username, String password);
}
