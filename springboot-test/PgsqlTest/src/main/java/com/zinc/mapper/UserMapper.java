package com.zinc.mapper;

import com.zinc.domain.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    public List<user> findAll();

    @Insert("insert into t_user (username,password) value(#{username},#{password}))")
    public Integer insertT(user newUser);



}
