package com.s3.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 *  商品类型类
 */
@Data
public class Category implements Serializable {
    private Integer categoryId;         // 商品类型主键
    private String categoryName;        // 商品类型名字
    private String categoryImageSrc;    // 商品类型图片
}
