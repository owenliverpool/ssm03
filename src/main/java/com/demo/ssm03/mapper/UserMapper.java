package com.demo.ssm03.mapper;

import com.demo.ssm03.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface UserMapper {

    //查询单条数据
    @Select("select * from userinfo where user_id = #{id}")
    //如果类属性和表字段不一致，需要使用Result来指定映射，否则不用
    @Results({
            @Result(property = "id",column="user_id"),
            @Result(property = "name",column="user_name"),
            @Result(property = "age",column="age"),
            @Result(property = "gender",column="gender"),
            @Result(property = "state",column="state"),
            @Result(property = "ctime",column="create_time")
    })
    public UserEntity query(Integer id);

    //查询多条数据
    //如果类属性和表字段不一致，需要使用Result来指定映射，否则不用
    @Results({
            @Result(property = "id",column="user_id"),
            @Result(property = "name",column="user_name"),
            @Result(property = "age",column="age"),
            @Result(property = "gender",column="gender"),
            @Result(property = "state",column="state"),
            @Result(property = "ctime",column="create_time")
    })
    @Select("select * from userinfo")
    public List<UserEntity> getList();

    //删除指定数据
    @Delete("delete from userinfo where user_id = #{id}")
    public int remove(Integer id);

    //插入
    //指定表的id列为自增主键并自动绑定到pojo
    @Options(useGeneratedKeys = true,keyColumn = "user_id")
    @Insert("insert into userinfo(user_name,age,gender) values(#{name},#{age},#{gender})")
    public int add(UserEntity user);

    //更新
    @Update("update userinfo set user_name=#{name},age=#{age},gender=#{gender},state=#{state},create_time=#{ctime} where id=#{id}")
    public int edit(UserEntity user);



    /*
    @InsertProvider(type=UserProvider.class, method = "batchInsert")
    int batchInsert(@Param("userList")List<UserEntity> userList);

    @SelectProvider(type = UserProvider.class, method = "queryUser")
    @Results({
            @Result(property = "sex", column = "sex", javaType = SexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    public List<UserEntity> queryUser(UserEntity user);
    */
}
