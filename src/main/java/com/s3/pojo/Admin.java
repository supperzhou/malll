package com.s3.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 管理员类
 */
@Data
public class Admin implements Serializable {
    private Integer adminId;                // 管理员主键
    private String adminName;               // 管理员姓名
    private String adminNickname;           // 管理员昵称
    private String adminPassword;           // 管理员密码
    private String adminProfilePictureSrc;  // 管理员头像
}
