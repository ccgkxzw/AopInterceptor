package com.xzw.interceter.mapper;


import com.xzw.interceter.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectByUserName(String username);

}