package com.s3.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户类
 */
@Data
public class User implements Serializable {
    private Integer userId;                 // 用户表主键
    private String userName;                // 用户姓名
    private String userNickName;            // 用户昵称
    private String userPassword;            // 用户密码
    private String userRealname;            // 用户真实姓名
    private Integer userGender;             // 用户性别
    private String userBirthday;            // 用户出生日期
    private String userAddress;             // 用户收货地址、对应地址表中的主键
    private String userHomePlace;           // 用户家庭地址、对应地址表中的主键
    private String userProfilePictureSrc;   // 用户头像地址
}
