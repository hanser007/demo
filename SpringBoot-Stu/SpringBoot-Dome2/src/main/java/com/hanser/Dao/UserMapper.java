package com.hanser.Dao;

import com.hanser.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserById(int id);
}



