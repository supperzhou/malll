package com.s3.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 *  商品属性类
 */
@Data
public class Property implements Serializable {
    private Integer propertyId;     // 商品属性主键
    private String propertyName;    // 商品属性名
    private Integer propertyCategoryId;  // 该商品属性对应哪个类型id(类型表主键)
}
