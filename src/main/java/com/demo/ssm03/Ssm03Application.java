package com.demo.ssm03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@SpringBootApplication默认提供EnableAutoConfiguration和ComponetScan的功能
//EnableAutoConfiguration -> 自动配置初始化spring环境和springmvc环境
//ComponetScan -> 扫描范当前入口类所在的包及子包(com.demo.ssm03及其子包)
@SpringBootApplication
//开启事务管理
@EnableTransactionManagement
//扫描XXXMapper.xml文件所在的目录
//resources/mapper目录和com.demo.ssm03/mapper目录，在输出时会合并为一个.因此实际扫描的目录是resources/mapper
@MapperScan("com.demo.ssm03.mapper")
public class Ssm03Application {

    public static void main(String[] args) {
        SpringApplication.run(Ssm03Application.class, args);
    }

}
