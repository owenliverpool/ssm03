package com.demo.ssm03.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class UserEntity {
    //字段
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String state;

    //通过注释转换表字段<->类属性的类型
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date ctime;

    //构造方法
    public UserEntity(){}

    //属性
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
