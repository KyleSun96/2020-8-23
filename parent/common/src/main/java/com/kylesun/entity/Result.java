package com.kylesun.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName: Result
 * @Description:
 * @Author: KyleSun
 **/
@Getter
@Setter
@ToString
public class Result<T> implements Serializable {

    private boolean flag;   //执行结果，true为执行成功 false为执行失败

    private String message; //返回结果信息，主要用于页面提示信息

    private T data;    //返回数据

    public Result() {
    }

    public Result(boolean flag, String message) {
        super();
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag, String message, T data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }
}
