package com.yyb.Dao;


import com.yyb.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StuMapper {
    Student getPS( String username);
}
