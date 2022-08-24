package com.zinc.service;

import com.zinc.entity.userEntity;
import com.zinc.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    private static userMapper Usermapper;

    public static List<userEntity> findall() {

        return Usermapper.findALL();
    }

    public Integer save(userEntity entity) {
        if (entity.getId() == null){  //如果id为空，则为新增
            return Usermapper.save(entity);
        }else{                        //id不为空则是更新
            return Usermapper.update(entity);
        }
    }

    public Integer DELETE(Integer id){
        return Usermapper.DELETE(id);
    }
}
