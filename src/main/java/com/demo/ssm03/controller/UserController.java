package com.demo.ssm03.controller;

import com.demo.ssm03.entity.UserEntity;
import com.demo.ssm03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserEntity query(@PathVariable("id") Integer id){
        return userService.query(id);
    }

    @GetMapping("/getlist")
    public List<UserEntity> getlist(){
        return userService.getList();
    }

    @PostMapping("/add")
    public String add(UserEntity user){
        int count = userService.add(user);
        if(count > 0){
            //添加成功
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    @DeleteMapping("/remove/{id}")
    public String remove(@PathVariable("id") Integer id){
        int count = userService.remove(id);
        if(count > 0){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @PostMapping("/edit/{id}")
    public String edit(UserEntity user){
        int count = userService.edit(user);
        if(count > 0){
            return "编辑成功";
        }else{
            return "编辑失败";
        }
    }

    /*
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String query(@PathVariable("id") Integer id){
        return "Your Input: " + id;
    }
     */
}
