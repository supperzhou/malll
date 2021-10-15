package com.s3.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 *  地址类
 */
@Data
public class Address implements Serializable {
    private String addressAreaId;          // 主键
    private String addressName;             // 地址
    private String addressRegionId;        // 父区域id(对应该表主键)
}
