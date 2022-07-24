package com.zhj.springbootmysql.mysqlclass.mapper;

import com.zhj.springbootmysql.mysqlclass.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    // 查询数据
    @Select("select * from usertable order by user_id desc")
    List<User> getUserList();

    // 插入数据
    @Insert("insert into usertable(username,userpassword,age,sex) values(#{username},#{userpassword},#{age},#{sex})")
    int AddUser(User user);

}
