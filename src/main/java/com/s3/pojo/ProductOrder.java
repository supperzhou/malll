package com.s3.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 *  商品订单表
 */
@Data
public class ProductOrder implements Serializable {
    private Integer productorderId;     // 商品订单主键
    private String productorderCode;    // 订单编号
    private String productorderAddress; // 收货地址、对应地址表主键
    private String productorderDetailAddress;   // 订单详细收货地址
    private String productorderPost;    // 邮编
    private String productorderReceiver;// 收件人
    private String productorderMobile;  // 收件人电话
    private String productorderPayDate; // 支付日期
    private String productorderDeliveryDate;    // 运送日期
    private String productorderConfirmDate;     // 确认收货日期
    private Integer productorderStatus;  // 商品订单状态 0:代付款、1:待发货、2:待收货、3:已完成
    private Integer productorderUserId;  // 该订单对应的用户id
}
