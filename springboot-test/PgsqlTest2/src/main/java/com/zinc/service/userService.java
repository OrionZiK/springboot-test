package com.zinc.service;

import com.zinc.entity.userEntity;
import com.zinc.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Configurable
public class userService {
    @Autowired
    public userMapper Usermanager;

    public List<userEntity> findall() {
        List<userEntity> list = Usermanager.findALL();
        return list;
    }

    public Integer save(userEntity entity) {
        if (entity.getId() == null){  //如果id为空，则为新增
            return Usermanager.save(entity);
        }else{                        //id不为空则是更新
            return Usermanager.update(entity);
        }
    }

    public Integer DELETE(Integer id){
        return Usermanager.DELETE(id);
    }
}
