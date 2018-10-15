package com.aitongyi.web.dao.mapper;

import com.aitongyi.web.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select(value = "select username,password,enabled from users where username = #{username}")
    User loadUserByUserName(@Param("username") String username);

    @Insert(value = "insert into users (username, password, enabled, create_date) value(#{username},#{password},#{enabled},#{createDate})")
    void saveUser(User user);
}
