package com.xzw.interceter.service;

import com.xzw.interceter.commom.DynamicDataSourceEnum;
import com.xzw.interceter.config.DataSourceSelector;
import com.xzw.interceter.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User getUserSlave(String name);


    User getUserMaster(String name);

    User getUser(String name);


}
