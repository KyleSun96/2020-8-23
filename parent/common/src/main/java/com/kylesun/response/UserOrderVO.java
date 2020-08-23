package com.kylesun.response;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: KyleSun swy0907163@163.com
 * @Date: 23:47 2020/8/23
 **/
@Data
public class UserOrderVO {

    private String username;
    private String nickName;
    private String headPic;
    private String sex;

    private List<OrderVO> orderList;

}
