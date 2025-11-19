package com.example.deltaforceemulator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.deltaforceemulator.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends IService<User>, UserDetailsService {

    User register(String username, String password);

    User login(String username, String password);
}
