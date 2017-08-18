package com.hh.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "响应对象")
public class ResponseBean<T> {

    @ApiModelProperty(value = "编码")
    private int code;

    @ApiModelProperty(value = "信息")
    private String msg;

    @ApiModelProperty(value = "响应值")
    private T value;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
