package com.kylesun.response;

import lombok.Data;

/**
 * @Description:
 * @Author: KyleSun swy0907163@163.com
 * @Date: 23:47 2020/8/23
 **/
@Data
public class OrderVO {

    private String id;
    private Integer totalNum;
    private Integer payMoney;
    private String orderStatus;

}
