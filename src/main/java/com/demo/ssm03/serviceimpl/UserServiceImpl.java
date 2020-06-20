package com.demo.ssm03.serviceimpl;

import com.demo.ssm03.entity.UserEntity;
import com.demo.ssm03.mapper.UserMapper;
import com.demo.ssm03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    //获取Mapper
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity query(Integer id) {
        return userMapper.query(id);
    }

    @Override
    public List<UserEntity> getList() {
        return userMapper.getList();
    }

    @Override
    public int remove(Integer id) {
        return userMapper.remove(id);
    }

    @Override
    public int add(UserEntity user) {
        return userMapper.add(user);
    }

    @Override
    public int edit(UserEntity user) {
        return userMapper.edit(user);
    }
}
