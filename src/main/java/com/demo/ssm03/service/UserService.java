package com.demo.ssm03.service;

import com.demo.ssm03.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserService {
    //查询单条数据
    public UserEntity query(Integer id);

    //查询多条数据
    public List<UserEntity> getList();

    //删除指定数据
    public int remove(Integer id);

    //插入
    public int add(UserEntity user);

    //更新
    public int edit(UserEntity user);

}
