package com.example.deltaforceemulator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.deltaforceemulator.entity.User;

// The @MapperScan on the main application class makes this @Mapper annotation redundant.
// Removing it to avoid double processing by Spring.
public interface UserMapper extends BaseMapper<User> {
}
