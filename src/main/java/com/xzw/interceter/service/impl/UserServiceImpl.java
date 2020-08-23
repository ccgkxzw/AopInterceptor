package com.xzw.interceter.service.impl;

import com.xzw.interceter.commom.DynamicDataSourceEnum;
import com.xzw.interceter.config.DataSourceSelector;
import com.xzw.interceter.mapper.UserMapper;
import com.xzw.interceter.pojo.User;
import com.xzw.interceter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    @DataSourceSelector(value = DynamicDataSourceEnum.SLAVE)
    public User getUserSlave(String name) {
        return userMapper.selectByUserName(name);
    }

    @Override
    @DataSourceSelector(value = DynamicDataSourceEnum.MASTER)
    public User getUserMaster(String name) {
        return userMapper.selectByUserName(name);
    }

    @Override
    public User getUser(String name) {
        return userMapper.selectByUserName(name);
    }
}
