package com.zinc.service;

import com.zinc.entity.userEntity;
import com.zinc.mapper.UserXmlMapper;
import com.zinc.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Configurable
public class userService {
    @Autowired
    public userMapper Usermanager;

    @Autowired
    public UserXmlMapper xmlMapper;

    public List<userEntity> findall() {
        List<userEntity> list = Usermanager.findALL();
        return list;
    }

    public List<userEntity> findall2() {
        List<userEntity> list2 = xmlMapper.findAll();
        return list2;
    }

    public Integer save(userEntity entity) {
        if (entity.getId() == null){  //如果id为空，则为新增
            return Usermanager.save(entity);
        }else{                        //id不为空则是更新
            return Usermanager.update(entity);
        }
    }
//    public Integer save(userEntity entity) {
//
//            return Usermanager.save(entity);
//
//    }
//
//    public Integer change(userEntity entity) {
//
//        return Usermanager.update(entity);
//
//    }



    public Integer DELETE(Integer id){
        return Usermanager.DELETE(id);
    }
}
