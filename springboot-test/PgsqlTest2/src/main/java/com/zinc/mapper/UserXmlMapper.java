package com.zinc.mapper;


import com.zinc.entity.userEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserXmlMapper {

    public List<userEntity> findAll();

}
