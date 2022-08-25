package com.zinc.mapper;

import com.zinc.entity.userEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userMapper {

    @Select("select * from demo")
    public List<userEntity> findALL();

    @Insert("INSERT INTO demo (id,username,password,address,email)VALUES(#{id},#{username},#{password},#{address},#{email})")
    Integer save(userEntity entity);

    Integer update(userEntity entity);

    @Delete("DELETE FROM demo where id=#{id}")
    Integer DELETE(Integer id);
}