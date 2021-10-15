package com.s3.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 *  商品属性值表
 */
@Data
public class PropertyValue implements Serializable {
    private Integer propertyValueId;            // 商品属性值主键
    private String propertyValueValue;          // 商品属性的属性值
    private Integer propertyValuePropertyId;    // 对应商品属性表中的主键
    private Integer propertyValueProductId;     // 对应商品表中的主键
}
