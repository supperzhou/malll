package com.s3.mapper;

import com.s3.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getUserlogin(@Param("userName") String userName,@Param("userPassword") String userPassword);

}
